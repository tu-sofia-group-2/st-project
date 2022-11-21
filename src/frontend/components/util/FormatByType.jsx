import React from "react";
import { StyleSheet } from "react-native";
import { BOOLEAN } from "../../constants/FormatTypesEnum";

const FormatByType = ({input, type}) => {
    return (typeof input === BOOLEAN || type === BOOLEAN) ? (
        (input) ? 
        <View style = {{backgroundColor: "green", ...styles.box}}/>
        :
        <View style = {{backgroundColor: "red", ...styles.box}}/>
    ) : (null)
}

const styles = StyleSheet.create({
    box: {
        width: "80%",
        height: "80%",
        borderRadius: 3
    }
})

export default FormatByType;