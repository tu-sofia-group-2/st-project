import React, { useState } from "react";
import { StyleSheet, TouchableOpacity, View, Text } from 'react-native';
import { ScrollView } from "react-native-gesture-handler";
import { SUBJECTS_LIST_MOCK, SUBJECT_LIST_RENDERER_MOCK } from "./test/SubjectsMockDataConstants";
import DraggableModal from "./components/util/DraggableModal";
import SubjectsList from "./components/subjects/SubjectsList";
import SubjectListRenderer from "./components/subjects/SubjectListRenderer";
import PopupCombined from "./components/util/PopupCombined";

export default function App() {

  const [isModalOpen, setIsModalOpen] = useState(false);

return <View style={styles.container}>
  <View style={{width: "100%"}}>
      <SubjectListRenderer data={SUBJECT_LIST_RENDERER_MOCK} onPress={()=>{setIsModalOpen(true)}} type={"student"}/>
      </View>
      <PopupCombined isModalOpen={isModalOpen} setIsModalOpen={setIsModalOpen}>
          <ScrollView style={{alignSelf:"center", width: "100%"}}>
            <View>
              <Text style={{fontWeight:"bold", }}>
                hi
              </Text>
            </View>
            <View>
              <Text style={{fontWeight:"bold", }}>
                hi
              </Text>
            </View>
            <View>
              <Text style={{fontWeight:"bold", }}>
                hi
              </Text>
            </View>
            <View>
              <Text style={{fontWeight:"bold", }}>
                hi
              </Text>
            </View>
            <View>
              <Text style={{fontWeight:"bold", }}>
                hi
              </Text>
            </View>
            <View>
              <Text style={{fontWeight:"bold", }}>
                hi
              </Text>
            </View>
            <View>
              <Text style={{fontWeight:"bold", }}>
                hi
              </Text>
            </View>
            <View>
              <Text style={{fontWeight:"bold", }}>
                hi
              </Text>
            </View>
            <View>
              <Text style={{fontWeight:"bold", }}>
                hi
              </Text>
            </View>
            <View>
              <Text style={{fontWeight:"bold", }}>
                hi
              </Text>
            </View>
            <View>
              <Text style={{fontWeight:"bold", }}>
                hi
              </Text>
            </View><View>
              <Text style={{fontWeight:"bold", }}>
                hi
              </Text>
            </View>
            <View>
              <Text style={{fontWeight:"bold", }}>
                hi
              </Text>
            </View>
            <View>
              <Text style={{fontWeight:"bold", }}>
                hi
              </Text>
            </View>
            <View>
              <Text style={{fontWeight:"bold", }}>
                hi
              </Text>
            </View>
            <View>
              <Text style={{fontWeight:"bold", }}>
                hi
              </Text>
            </View>
            <View>
              <Text style={{fontWeight:"bold", }}>
                hi
              </Text>
            </View>
            <View>
              <Text style={{fontWeight:"bold", }}>
                hi
              </Text>
            </View>
            <View>
              <Text style={{fontWeight:"bold", }}>
                hi
              </Text>
            </View>
            <View>
              <Text style={{fontWeight:"bold", }}>
                hi
              </Text>
            </View>
            <View>
              <Text style={{fontWeight:"bold", }}>
                hi
              </Text>
            </View>
            <View>
              <Text style={{fontWeight:"bold", }}>
                hi
              </Text>
            </View>
            <View>
              <Text style={{fontWeight:"bold", }}>
                hi
              </Text>
            </View><View>
              <Text style={{fontWeight:"bold", }}>
                hi
              </Text>
            </View>
            <View>
              <Text style={{fontWeight:"bold", }}>
                hi
              </Text>
            </View>
            <View>
              <Text style={{fontWeight:"bold", }}>
                hi
              </Text>
            </View>
            <View>
              <Text style={{fontWeight:"bold", }}>
                hi
              </Text>
            </View>
            <View>
              <Text style={{fontWeight:"bold", }}>
                hi
              </Text>
            </View>
            <View>
              <Text style={{fontWeight:"bold", }}>
                hi
              </Text>
            </View>
            <View>
              <Text style={{fontWeight:"bold", }}>
                hi
              </Text>
            </View>
            <View>
              <Text style={{fontWeight:"bold", }}>
                hi
              </Text>
            </View>
            <View>
              <Text style={{fontWeight:"bold", }}>
                hi
              </Text>
            </View>
            <View>
              <Text style={{fontWeight:"bold", }}>
                hi
              </Text>
            </View>
            <View>
              <Text style={{fontWeight:"bold", }}>
                hi
              </Text>
            </View>
            <View>
              <Text style={{fontWeight:"bold", }}>
                hi
              </Text>
            </View><View>
              <Text style={{fontWeight:"bold", }}>
                hi
              </Text>
            </View>
            <View>
              <Text style={{fontWeight:"bold", }}>
                hi
              </Text>
            </View>
            <View>
              <Text style={{fontWeight:"bold", }}>
                hi
              </Text>
            </View>
            <View>
              <Text style={{fontWeight:"bold", }}>
                hi
              </Text>
            </View>
            <View>
              <Text style={{fontWeight:"bold", }}>
                hi
              </Text>
            </View>
            <View>
              <Text style={{fontWeight:"bold", }}>
                hi
              </Text>
            </View>
            <View>
              <Text style={{fontWeight:"bold", }}>
                hi
              </Text>
            </View>
            <View>
              <Text style={{fontWeight:"bold", }}>
                hi
              </Text>
            </View>
            <View>
              <Text style={{fontWeight:"bold", }}>
                hi
              </Text>
            </View>
            <View>
              <Text style={{fontWeight:"bold", }}>
                hi
              </Text>
            </View>
            <View>
              <Text style={{fontWeight:"bold", }}>
                hi
              </Text>
            </View>
            <View>
              <Text style={{fontWeight:"bold", }}>
                hi
              </Text>
            </View><View>
              <Text style={{fontWeight:"bold", }}>
                hi
              </Text>
            </View>
            <View>
              <Text style={{fontWeight:"bold", }}>
                hi
              </Text>
            </View>
            <View>
              <Text style={{fontWeight:"bold", }}>
                hi
              </Text>
            </View>
            <View>
              <Text style={{fontWeight:"bold", }}>
                hi
              </Text>
            </View>
            <View>
              <Text style={{fontWeight:"bold", }}>
                hi
              </Text>
            </View>
            <View>
              <Text style={{fontWeight:"bold", }}>
                hi
              </Text>
            </View>
            <View>
              <Text style={{fontWeight:"bold", }}>
                hi
              </Text>
            </View>
            <View>
              <Text style={{fontWeight:"bold", }}>
                hi
              </Text>
            </View>
            <View>
              <Text style={{fontWeight:"bold", }}>
                hi
              </Text>
            </View>
            <View>
              <Text style={{fontWeight:"bold", }}>
                hi
              </Text>
            </View>
            <View>
              <Text style={{fontWeight:"bold", }}>
                hi
              </Text>
            </View>
            <View>
              <Text style={{fontWeight:"bold", }}>
                hi
              </Text>
            </View><View>
              <Text style={{fontWeight:"bold", }}>
                hi
              </Text>
            </View>
          </ScrollView>
      </PopupCombined>
    </View>
};

const styles = StyleSheet.create({
  container: {
    flex: 1,
    width: "100%",
    padding: "3%",
    backgroundColor: '#f2f2f2',
    alignItems: 'center',
    justifyContent: 'center',
    alignSelf:"center"
  }
});
