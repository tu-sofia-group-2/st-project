import React from "react";
import { Modal, StyleSheet} from "react-native";
import BottomSheet from "./BottomSheet";
import { GestureHandlerRootView } from "react-native-gesture-handler";

const DraggableModal = (props) => {
    return <Modal
        transparent={true}
        visible={props.isModalOpen}
        style={styles.modal}
    >
            <GestureHandlerRootView style={{ flex: 1,  backgroundColor: 'rgba(0, 0, 0, 0.5)'  }}>
                <BottomSheet setClosed={props.setIsModalOpen}>
                    {props.children}
                </BottomSheet>
            </GestureHandlerRootView>
    </Modal>
};

const styles = StyleSheet.create({
    topBar: {
        height: "10%",
        borderTopRightRadius: "50px",
        borderTopLeftRadius: "50px",

    },
    modal: {
        width: "100%",
        height: "100%",
        margin: 0,
        alignItems: "flex-end"
    }
})

export default DraggableModal;