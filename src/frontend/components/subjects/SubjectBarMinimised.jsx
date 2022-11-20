import React from "react";
import { Text, View, StyleSheet, TouchableOpacity } from "react-native";
import Icon from 'react-native-vector-icons/FontAwesome';

const ICON_SIZE = 15;

const SubjectBarMinimised = ({ name, labs, project, courseWork, seminars, lectures, onPress, type, index, subIndex }) => {

    const action = () => {
        console.log(type)
        const el = {
            type: type,
            index: index,
            subIndex: subIndex
        };
        console.log(el);
        onPress(el)
    }

    return (<TouchableOpacity onPress={()=>action()}>
        <View style={styles.wrapperComponent}>
            <View style={styles.leftTextContainer}>
                <Text style={styles.leftText}>
                    {name}
                </Text>
            </View>
            <View style={styles.iconsBar}>
                {lectures === null || lectures === undefined ? null :
                    (lectures === true ?
                        <Icon name="graduation-cap" size={ICON_SIZE} color="green" /> :
                        <Icon name="graduation-cap" size={ICON_SIZE} color="red" />)}
                {labs === null || labs === undefined ? null :
                    (labs === true ?
                        <Icon name="flask" size={ICON_SIZE} color="green" /> :
                        <Icon name="flask" size={ICON_SIZE} color="red" />)}
                {courseWork === null || courseWork === undefined ? null :
                    (courseWork === true ?
                        <Icon name="sticky-note-o" size={ICON_SIZE} color="green" /> :
                        <Icon name="sticky-note-o" size={ICON_SIZE} color="red" />)}
                {seminars === null || seminars === undefined ? null :
                    (seminars === true ?
                        <Icon name="group" size={ICON_SIZE} color="green" /> :
                        <Icon name="group" size={ICON_SIZE} color="red" />)}
                {project === null || project === undefined ? null :
                    (project === true ?
                        <Icon name="pencil-square" size={ICON_SIZE} color="green" /> :
                        <Icon name="pencil-square" size={ICON_SIZE} color="red" />)}

            </View>
        </View>
    </TouchableOpacity>);
}

SubjectBarMinimised.defaultProps = {
    name: null,
    labs: null,
    project: null,
    courseWork: null,
    seminars: null,
    lectures: null,
    type: null,
    index: null,
    subIndex: null,
    onPress: () => { }
}

const styles = StyleSheet.create({
    wrapperComponent: {
        display: "flex",
        flexDirection: "row",
        background: "#92B4EC",
        paddingLeft: "2%",
        paddingRight: "2%",
        width: "100%",
        paddingTop: "0.5%",
        paddingBottom: "0.5%",
        backgroundColor: "#92B4EC",
        borderRadius: 3,
        minHeight: 4,
        marginVertical: 4

    },
    leftTextContainer: {
        width: "65%",
        margin: "auto"
    },
    leftText: {
        fontWeight: "bold",
        color: "white",
    },
    iconsBar: {
        width: "35%",
        display: "flex",
        flexDirection: "row",
        justifyContent: "space-evenly",
        alignContent: "space-around",
        margin: "auto"
    }
})

export default SubjectBarMinimised;