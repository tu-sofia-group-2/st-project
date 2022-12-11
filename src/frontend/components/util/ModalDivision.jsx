import React from "react";
import { Modal, StyleSheet, TouchableOpacity, View, Text } from "react-native";
import { ScrollView } from "react-native-gesture-handler";

const ModalDivision = (props) => {

    return <Modal
        transparent={true}
        visible={props.isModalOpen}
        style={styles.modal}
    >
        <View style={styles.container}>
        <TouchableOpacity
            style={styles.button}
            onPress={()=>{props.setIsModalOpen(false)}}>
                <Text style={styles.xContainer}>
                    X
                </Text>
            </TouchableOpacity>
            {props.children}
        </View>
    </Modal>

}

const styles = StyleSheet.create({
        modal: {
            display: "flex",
            flexDirection: "column",
            width: "100%",
            height: "100%",
            margin: 0,
            alignItems: "center",
            backgroundColor: "rgba( 0, 0, 0, 0.5)"
        },
        container: {
            marginLeft: 3,
            marginRight: 3,
            // width: "80%",
            marginTop:"5%",
            height: "80%",
            paddingBottom: "2%",
            marginLeft: "10%",
            marginRight:"10%",
            display: "flex",
            alignItems: "center",
            backgroundColor: "white",
            flexDirection: "column",
            borderRadius: 15
        },
        button : {
            alignSelf: "flex-end",
            width: 30,
            height: 30,
            marginRight:"1%",
            marginTop: "1%",
            marginBottom: "1%",
            backgroundColor: "red",
            borderRadius: "50%",
            alignItems: "center",
            color: "white",
            fontWeight:"bold"
        },
        xContainer: {
            color:"white",
            fontWeight: "bold",
            paddingTop: "20%"
        }


})

export default ModalDivision;