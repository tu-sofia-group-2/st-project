import React, {useState} from "react";
import { useEffect } from "react";
import SubjectsPage from "../components/subjects/SubjectsPage";
import { getSubjectsByUser } from "../components/util/Fetch";

const SubjectsPageWrapper = ({userId}) => {
    const [loading, setLoading] = useState(true) 
    const [subjects, setSubjects] = useState(null);

    const normalizeData = (data) => {
        return data;
    }

    useEffect(()=>{
        getSubjectsByUser(userId)
        .then(result=>normalizeData(result))
        .then(normalized=>setSubjects(normalized))
        .finally(setLoading(false));
    },[userId])

    return (loading ? "Loading" : <SubjectsPage data = {subjects}/>)
}

export default SubjectsPageWrapper;