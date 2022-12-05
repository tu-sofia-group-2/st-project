import React, {useState} from "react";
import { StyleSheet, Text, View } from 'react-native';
import Button from "./Button";
import InputFields from "./InputFields";
import {CREATE, EDIT} from "../constants/UserModeTypesEnum"
import { validateNumber } from "../util/Validations";
const UserForm =({data, setSubmitData, mode, roles, id, setId, errId, 
    setErrId, facultyId, setFacultyId, errFacId, setErrFacId})=>{

    const onClick=()=>{
        //TODO validate fields, const obj, setSubmitData obj
        if(validateNumber(id) && validateNumber(facultyId)){
            const obj = {
                id: id,
                facultyId: facultyId
            }
            console.log(obj)
        }
        if(!validateNumber(id)){
            setErrId(true)
        }
        if(!validateNumber(facultyId)){
            setErrFacId(true)
        }
    }
    return(
        <View>
            <InputFields defaultText={'id'} value = {id} onChange = {setId} error ={errId}></InputFields>
            <InputFields defaultText={'facultyId'} value = {facultyId} onChange = {setFacultyId} error={errFacId}></InputFields>
            <InputFields defaultText={'firstName'}></InputFields>
            <InputFields defaultText={'lastName'}></InputFields>
            <InputFields defaultText={'middleName'}></InputFields>
            <InputFields defaultText={'gender'}></InputFields>
            <InputFields defaultText={'programmes'}></InputFields>
            <InputFields defaultText={'contacts'}></InputFields>
            <InputFields defaultText={'role'}></InputFields>
            <Button label = {"Submit"} onClick={onClick}></Button>
        </View>    
    )
}


UserForm.defaultProperties = {
    data: "",
    setSubmitData: ()=>{},
    mode: CREATE
    
}
export default UserForm;