import React, { useEffect, useState } from "react";
import { StyleSheet, Text, View, TouchableOpacity } from "react-native";
import { NORMAL, ACTIVE, WARNING, LOGIN } from "../constants/ButtonTypesEnum";

const Button = ({onClick, active, error, label, type})=>{
    const [GeneratedStyle, setGeneratedStyle] = useState(styleButton.normal);
    const generateStyle = (error, type)=>{
        let warning = "";
        switch(type){
            case NORMAL : 
                warning = styleButton.normal;
                break;
            case WARNING :
                warning = styleButton.warning;
                break;
            case LOGIN :
                warning = styleButton.login;
                break;
            case ACTIVE :
                warning = styleButton.active;
                break;
        }
        if(error){
           return StyleSheet.compose(warning, styleButton.error);
        }
        else{
            return warning;
        }   
    }
    useEffect(()=>{
        const s = generateStyle(error, type);
        setGeneratedStyle(s);
    },[type,error])
    return (
        <TouchableOpacity disabled={!active} style={GeneratedStyle} onPress={onClick}>
            <Text>{label}</Text>
        </TouchableOpacity>
    )
}  

Button.defaultProps = {
    onClick: () => {},
    active: true,
    error: false,
    label: "",
    type: NORMAL
}
const styleButton = StyleSheet.create({
    warning: {
        backgroundColor: "red" 
    },
    active: {
        backgroundColor: "green"
    },
    normal: {
        backgroundColor: "blue"
    },
    login: {
        backgroundColor: "yellow"
    },
    error: {
        borderColor: "red",
        borderWidth: 15
    }
})
export default Button; 