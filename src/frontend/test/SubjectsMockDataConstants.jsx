export const SUBJECTS_LIST_MOCK = [
    {
        id: 1,
        name: "OOPP",
        labs: true,
        lectures: true,
        seminars: true,
        project: true,
        courseWork: true
    },
    {
        id: 2,
        name: "Software Tech",
        labs: true,
        lectures: true,
    },
    {
        id: 3,
        name: "Assembly",
        labs: true,
        lectures: true,
        seminars: false,
    },
];

export const SUBJECT_LIST_RENDERER_MOCK = [
    {
        id: 1,
        header: "Y2 Winter",
        subjects: SUBJECTS_LIST_MOCK
    },
    {
        id: 2,
        header: "Y2 Summer",
        subjects: SUBJECTS_LIST_MOCK
    },
    {
        id: 3,
        header: "Y3 Winter",
        subjects: SUBJECTS_LIST_MOCK
    },
];