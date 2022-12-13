import React from "react";
import { StyleSheet, View, Text } from "react-native";

const ScrollDetailsFormElement = ({value, label}) => {
    return <View style={styles.container}>
        <Text>
            {label} 
        </Text>
        <Text>
            {value}
        </Text>
    </View>
}

const styles = StyleSheet.create({
    container : {
        display: "flex",
        flexDirection: "row",
        paddingHorizontal: 10,
        borderRadius: 25
    }
})

export default ScrollDetailsFormElement;