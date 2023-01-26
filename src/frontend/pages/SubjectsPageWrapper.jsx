import React, { useState } from "react";
import { useEffect } from "react";
import SubjectsPage from "../components/subjects/SubjectsPage";
import { getSubjectsByUser } from "../components/util/Fetch";

import { SUBJECT_LIST_RENDERER_MOCK } from "../test/SubjectsMockDataConstants";

const SubjectsPageWrapper = (...props) => {
    const [loading, setLoading] = useState(false)
    const [subjects, setSubjects] = useState({
        teacher: SUBJECT_LIST_RENDERER_MOCK,
        student: SUBJECT_LIST_RENDERER_MOCK
    });

    const normalizeData = (data) => {
        return data;
    }

    useEffect(() => {
        getSubjectsByUser(props[0].route.params.userId)
            .then(result => normalizeData(result))
            .then(normalized => setSubjects({ teacher: [], student: normalized }))
            .finally(setLoading(false));

    }, [props[0].route.params.userId])

    return (loading ? "Loading" : <SubjectsPage data={subjects} />)
}

export default SubjectsPageWrapper;