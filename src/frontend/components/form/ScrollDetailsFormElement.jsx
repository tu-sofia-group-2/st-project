import React from "react";
import { StyleSheet, View, Text } from "react-native";
import FormattedText from "../util/FormattedText";

const ScrollDetailsFormElement = ({ value, label }) => {
    return <View style={styles.container}>
        <FormattedText text={label} />
        <FormattedText text={value} />
    </View>
}

const styles = StyleSheet.create({
    container: {
        display: "flex",
        flexDirection: "row",
        paddingHorizontal: 10,
        borderRadius: 25
    }
})

export default ScrollDetailsFormElement;