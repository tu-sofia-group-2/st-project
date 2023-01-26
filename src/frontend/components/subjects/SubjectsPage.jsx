import React, { useState } from "react";
import { ScrollView, Text, StyleSheet, View, TextInput } from "react-native";
import { CENTER } from "../../constants/SeperatorTypesEnum";
import { MOCK_DATA_UNEDITABLE } from "../../test/FormMockDataConstants";
import Form from "../form/Form";
import { getSubjectBySubjectId } from "../util/Fetch";
import PopupCombined from "../util/PopupCombined";
import Seperator from "../util/Seperator";
import SubjectListRenderer from "./SubjectListRenderer";
import { useEffect } from "react";

export const TYPE_TEACHER = "teacher";
export const TYPE_STUDENT = "student";

const SubjectsPage = ({ data }) => {
    const [selected, setSelected] = useState(MOCK_DATA_UNEDITABLE);
    const [hidden, isHidden] = useState(false);

    const normalize = (result) => {
        return result;
    }

    const onPress = (object) => {
        // let typeList = (object.type === TYPE_TEACHER ? data.teacher : data.student);
        // let subjectId = typeList[object.index].subjects[object.subindex].id;
        // getSubjectBySubjectId(subjectId)
        // .then(result=>normalize(result))
        // .then(normalized=>setSelected(normalized))
        // .finally(isHidden(true));
        isHidden(true)
    }

    return !data ? <ActivityIndicator size="large" /> :
        <ScrollView
            style={styles.v}
            alwaysBounceVertical
            showsHorizontalScrollIndicator={false}
            showsVerticalScrollIndicator={false}>
            {data.student === undefined || data.student === null ? null :
                <View>
                    <Seperator text="Student" type={CENTER} color="gray" />
                    <SubjectListRenderer data={data.student} type={TYPE_STUDENT} onPress={onPress} />
                </View>
            }
            {data.teacher === undefined || data.teacher === null ? null :
                <View>
                    <Seperator text="Teacher" type={CENTER} color="gray" />
                    <SubjectListRenderer data={data.teacher} type={TYPE_TEACHER} onPress={onPress} />
                </View>
            }
            <PopupCombined isModalOpen={hidden} setIsModalOpen={isHidden}>
                <Form
                    data={selected}
                    feedback={true}
                />
            </PopupCombined>
        </ScrollView>;
};

const styles = StyleSheet.create({
    v: {
        marginTop: "10%",
        marginHorizontal: "3%"
    }
})

export default SubjectsPage