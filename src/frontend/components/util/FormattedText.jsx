import React from "react";
import { View, Text, StyleSheet } from "react-native";

const FormattedText = ({text, size}) => {
    return ( <View style={styles.textWrapper}>
        <Text style={{fontSize: size, ...styles.text}}>{text}</Text>
        </View>)


}
const styles = StyleSheet.create({
    text : {
        fontWeight: "bold",
        textAlign: 'center',
    },
    textWrapper : {
        flexShrink: 0,
        paddingHorizontal: "3%"
        
    }
})

FormattedText.defaultProps = {
    size: 15,
    color: "gray"
}

export default FormattedText;