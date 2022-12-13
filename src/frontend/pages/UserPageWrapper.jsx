import React from "react";
import { useEffect } from "react";
import { useState } from "react";
import UserCard from "../user/UserCard";
import { getUserByUserId } from "../util/Fetch";

const UserPageWrapper = ({userId}) => {
    const [loading, isLoading] = useState(true);
    const [user, setUser] = useState({});

    const normalizeResult = (data) => {
        return data;
    }
    
    useEffect(()=>{
        getUserByUserId(userId)
        .then(result=>normalizeResult(result))
        .then(normalized=>setUser(normalized))
        .finally(isLoading(false))
    },[userId])

    return(loading ? "loading" : <UserCard user={user}/>)
}

export default UserPageWrapper;