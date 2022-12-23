import React from "react";
import { useEffect } from "react";
import { useState } from "react";
import { Text } from "react-native";
import UserCard from "../components/user/UserCard";
import { getUserByUserId } from "../components/util/Fetch";

const UserPageWrapper = (...props) => {
    const [loading, isLoading] = useState(true);
    const [user, setUser] = useState();

    const normalizeResult = (data) => {
        return data;
    }
    
    useEffect(()=>{
        
        getUserByUserId(props[0].route.params.userId)
        .then(result=>normalizeResult(result))
        .then(normalized=>{
            console.log(normalized);
            setUser(normalized)})
        .finally(isLoading(false))
        
    },[props[0].route.params.userId])

    return((loading && !user) ? <Text>"loading"</Text> : <UserCard user={user}/>)
}

export default UserPageWrapper;