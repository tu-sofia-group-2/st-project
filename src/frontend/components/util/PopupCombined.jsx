import React from "react";
import { Platform } from "react-native";
import DraggableModal from "./DraggableModal";
import ModalDivision from "./ModalDivision";

const PopupCombined = (props) => {
    return Platform.OS === "web" ?
        <ModalDivision
            isModalOpen={props.isModalOpen}
            setIsModalOpen={props.setIsModalOpen}
        >
            {props.children}
        </ModalDivision> :
        <DraggableModal
            isModalOpen={props.isModalOpen}
            setIsModalOpen={props.setIsModalOpen}
        >
            {props.children}
        </DraggableModal>
}

export default PopupCombined;