import React from "react";
import {Text, View, StyleSheet} from "react-native";
import { LEFT, RIGHT, CENTER, LINE } from "../../constants/SeperatorTypesEnum";

const Seperator = ({ text, type, color }) => {

    return type === LEFT ? (<View style={styles.container}>
        <View style={styles.textWrapper}>
            <Text style={{color: color, ...styles.text}}>{text}</Text>
        </View>
        <View style = {{backgroundColor: color, ...styles.line}} />
    </View>) : (type === RIGHT ? (
        <View style={styles.container}>
            <View style = {{backgroundColor: color, ...styles.line}} />
            <View style={styles.textWrapper}>
                <Text style={{color: color, ...styles.text}}>{text}</Text>
            </View>
        </View>
    ) : (type === CENTER ? (
        <View style={styles.container}>
            <View style = {{backgroundColor : color, ...styles.line}} />
            <View style={styles.textWrapper}>
                <Text style={{color: color, ...styles.text}}>{text}</Text>
            </View>
            <View style = {{backgroundColor : color, ...styles.line}} />
        </View>
    ) : (type === LINE ? (<View style={styles.container}>
        <View style = {{backgroundColor : color, ...styles.line}} /></View>) : (null))))

};

Seperator.defaultProps = {
    text: null,
    type: LEFT,
    color: "black"
};

const styles = StyleSheet.create ({
    container : {
        flexDirection: 'row',
        alignItems: 'center',
        padding: "2%"
    },
    line : {
        flex: 1,
        height: 1, 
    },
    text : {
        fontWeight: "bold",
        textAlign: 'center',
    },
    textWrapper : {
        flexShrink: 0,
        paddingHorizontal: "3%"
        
    }
})



export default Seperator;