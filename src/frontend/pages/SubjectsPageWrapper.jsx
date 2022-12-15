import React, {useState} from "react";
import { useEffect } from "react";
import SubjectsPage from "../components/subjects/SubjectsPage";
import { getSubjectsByUser } from "../components/util/Fetch";

import { SUBJECT_LIST_RENDERER_MOCK } from "../test/SubjectsMockDataConstants";

const SubjectsPageWrapper = ({userId}) => {
    const [loading, setLoading] = useState(false) 
    const [subjects, setSubjects] = useState({
        teacher : SUBJECT_LIST_RENDERER_MOCK,
        student : SUBJECT_LIST_RENDERER_MOCK
    });

    const normalizeData = (data) => {
        return data;
    }

    useEffect(()=>{
        // getSubjectsByUser(userId)
        // .then(result=>normalizeData(result))
        // .then(normalized=>setSubjects(normalized))
        // .finally(setLoading(false));
    },[userId])

    return (loading ? "Loading" : <SubjectsPage data = {subjects}/>)
}

export default SubjectsPageWrapper;