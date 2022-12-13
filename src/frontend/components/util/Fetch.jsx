import { Platform } from "react-native";
import { URL_MOBILE_PREFIX_DEVELOP, URL_WEB_PREFIX } from "../../constants/URLs";

export async function getSubjectsByUser(userId) {
    let uri = (Platform.OS === "web" ? `${URL_WEB_PREFIX}subjects?userId = ${userId}` :
     `${URL_MOBILE_PREFIX_DEVELOP}subjects?userId = ${userId}`);
    return fetch(uri).then(response => response.json());
}

export async function getUserByUserId(userId) {
    let uri = (Platform.OS === "web" ? `${URL_WEB_PREFIX}users/${userId}` :
     `${URL_MOBILE_PREFIX_DEVELOP}users/${userId}`);
    return fetch(uri).then(response => response.json());
}

export async function getSubjectBySubjectId(subjectId) {
    let uri = (Platform.OS === "web" ? `${URL_WEB_PREFIX}subjects/${subjectId}` :
     `${URL_MOBILE_PREFIX_DEVELOP}subjects/${subjectId}`);
    return fetch(uri).then(response => response.json());
}