import React, { useState } from "react";
import { View, Text } from "react-native";
import Form from "../form/Form";
import { getSubjectBySubjectId } from "../util/Fetch";
import PopupCombined from "../util/PopupCombined";
import SubjectListRenderer from "./SubjectListRenderer";

export const TYPE_TEACHER = "teacher";
export const TYPE_STUDENT = "student";

const SubjectsPage = ({ data }) => {
    const [selected, setSelected] = useState({});
    const [hidden, isHidden] = useState(true);

    const normalize=(result)=>{
        return result;
    }

    const onPress = (object) => {
        let typeList = (object.type === TYPE_TEACHER ? data.teacher : data.student);
        let subjectId = typeList[object.index].subjects[object.subindex].id;
        getSubjectBySubjectId(subjectId)
        .then(result=>normalize(result))
        .then(normalized=>setSelected(normalized))
        .finally(isHidden(false));
    }

    return !data ? <ActivityIndicator size="large" /> :
        <View>
            {data.student === undefined || data.student === null ? null :
                <View>
                    <Text>
                        Student
                    </Text>
                    <SubjectListRenderer data={data.student} type={TYPE_STUDENT} onPress={onPress} />
                </View>
            }
            {data.teacher === undefined || data.teacher === null ? null :
                <View>
                    <Text>
                        Teacher
                    </Text>
                    <SubjectListRenderer data={data.teacher} type={TYPE_TEACHER} onPress={onPress} />
                </View>
            }
            <PopupCombined isModalOpen={hidden} setIsModalOpen={isHidden}>
                <Form
                    data={selected}
                />
            </PopupCombined>
        </View>;
};

export default SubjectsPage