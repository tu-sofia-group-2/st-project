import { StyleSheet, Text, TouchableOpacity, View } from 'react-native';
import Navigation from './navigation';

export default function App() {
  return (
        <Navigation/>
  )
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
