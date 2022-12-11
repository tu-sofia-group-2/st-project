import React, { useState } from "react";
import { View, Text } from "react-native-web";
import SubjectListRenderer from "./SubjectListRenderer";

const SubjectsPage = ({ data }) => {

    const [selected, setSelected] = useState(null);

    return !data ? <ActivityIndicator size="large" /> :
        <View>
            {data.student === undefined || data.student === null ? null :
                <View>
                    <Text>
                        Student
                    </Text>
                    <SubjectListRenderer data={data.student} type="student" onPress={setSelected} />
                </View>
            }
            {data.teacher === undefined || data.teacher === null ? null :
                <View>
                    <Text>
                        Teacher
                    </Text>
                    <SubjectListRenderer data={data.teacher} type="teacher" onPress={setSelected} />
                </View>
            }
        </View>;
};

export default SubjectsPage