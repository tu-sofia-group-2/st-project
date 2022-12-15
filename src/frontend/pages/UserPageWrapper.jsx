import React from "react";
import { useEffect } from "react";
import { useState } from "react";
import UserCard from "../components/user/UserCard";
import { getUserByUserId } from "../components/util/Fetch";

const UserPageWrapper = ({userId}) => {
    const [loading, isLoading] = useState(false);
    const [user, setUser] = useState({});

    const normalizeResult = (data) => {
        return data;
    }
    
    useEffect(()=>{
        // getUserByUserId(userId)
        // .then(result=>normalizeResult(result))
        // .then(normalized=>setUser(normalized))
        // .finally(isLoading(false))
        setUser({
            name: "John Constantine",
            email: "john@testmail.com",
            img: "https://images.alphacoders.com/566/thumb-1920-566243.jpg",
            userId: "121220169",
            faculty: "KST",
            program: "KSI",
            formOfEducation: 'redovno',
            OKS: "bakalavar",
        })
    },[userId])

    return(loading ? "loading" : <UserCard user={user}/>)
}

export default UserPageWrapper;