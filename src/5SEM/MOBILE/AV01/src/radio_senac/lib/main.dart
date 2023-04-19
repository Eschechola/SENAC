import 'package:flutter/material.dart';

void main() {
  runApp(const MainApp());
}

class MainApp extends StatelessWidget {
  const MainApp({super.key});

  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      debugShowCheckedModeBanner: false,
      theme: ThemeData(
        primarySwatch: Colors.amber,
        textTheme: const TextTheme(
          bodyMedium: TextStyle(color: Colors.black)
        )
      ),
      home: const RadioPage()
    );
  }
}

class RadioPage extends StatefulWidget{
  const RadioPage({super.key});

  @override
  State<StatefulWidget> createState() => _RadioPageState();
}

class _RadioPageState extends State<RadioPage>{
  double _volumeValue = 10;
  bool _modulationValue = false;
  String _frequencyValue = "88,9 MHz";

  void volumeUp() {
    setState(() {
      _volumeValue = _volumeValue + 10 > 100 ? 100 : _volumeValue + 10;
    });
  }
    
  void volumeDown(){
    setState(() {
      _volumeValue = _volumeValue - 10 < 0 ? 0 : _volumeValue - 10;
    });
  }

  void _handleFrequency(String? value) {
    setState(() {
      _frequencyValue = value ?? "";
    });
  }

  @override
  Widget build(BuildContext context) {
    return Scaffold(
        appBar: AppBar(
          title: const Text("Rádio SENAC"),
        ),
        body: SingleChildScrollView(
          child: Center(
            child: Column(children: [
              Padding(
                padding: const EdgeInsets.only(top: 20),
                child: SizedBox(
                  width: MediaQuery.of(context).size.width * 0.8,
                  height: MediaQuery.of(context).size.height * 0.13,
                  child: Container(
                    decoration: const BoxDecoration(
                      border: Border(
                        top: BorderSide(
                          color: Colors.grey,
                          width: 5
                        ),
                      )
                    ),
                    child: Column(children: [
                      Padding(
                        padding: const EdgeInsets.only(top: 20),
                        child: Align(
                          alignment: Alignment.centerLeft,
                          child: Text(
                            "Volume: ${_volumeValue.round()}",
                            style: const TextStyle(
                              fontSize: 20
                            ),
                          ),
                        )
                      ),

                      Padding(
                        padding: const EdgeInsets.only(top: 20),
                        child: Align(
                          alignment: Alignment.centerLeft,
                          child: Slider(
                            thumbColor: Colors.blue,
                            inactiveColor: const Color.fromARGB(255, 193, 235, 254),
                            activeColor: Colors.blue,
                            value: _volumeValue,
                            max: 100,
                            onChanged: (double value){
                              setState(() {
                                _volumeValue = value;
                              });
                            },
                          )
                        ),
                      )
                    ],
                  )),
                ),
              ),

              Padding(
                padding: const EdgeInsets.only(top: 20),
                child: SizedBox(
                  width: MediaQuery.of(context).size.width * 0.8,
                  height: MediaQuery.of(context).size.height * 0.13,
                  child: Container(
                    decoration: const BoxDecoration(
                      border: Border(
                        top: BorderSide(
                          color: Colors.grey,
                          width: 5
                        ),
                      )
                    ),
                    child: Column(children: [
                      const Padding(
                        padding: EdgeInsets.only(top: 20),
                        child: Align(
                          alignment: Alignment.centerLeft,
                          child: Text(
                            "Modulação",
                            style: TextStyle(
                              fontSize: 20
                            ),
                          ),
                        )
                      ),

                      Padding(
                        padding: const EdgeInsets.only(top: 20),
                        child: Align(
                          alignment: Alignment.center,
                          child: Row(children: [
                            const Text("AM"),
                            Switch(
                              value: _modulationValue,
                              activeColor: Colors.blue,
                              onChanged: (bool value) {
                                setState(() {
                                  _modulationValue = !_modulationValue;
                                });
                              },
                            ),
                            const Text("FM"),
                          ],)
                        ),
                      )
                    ],
                  )),
                ),
              ),

              Padding(
                padding: const EdgeInsets.only(top: 20),
                child: SizedBox(
                  width: MediaQuery.of(context).size.width * 0.8,
                  height: MediaQuery.of(context).size.height * 0.13,
                  child: Container(
                    decoration: const BoxDecoration(
                      border: Border(
                        top: BorderSide(
                          color: Colors.grey,
                          width: 5
                        ),
                      )
                    ),
                    child: Column(children: [
                      const Padding(
                        padding:EdgeInsets.only(top: 20),
                        child: Align(
                          alignment: Alignment.centerLeft,
                          child: Text(
                            "Mensagem",
                            style: TextStyle(
                              fontSize: 20
                            ),
                          ),
                        )
                      ),

                      Padding(
                        padding: const EdgeInsets.only(top: 20),
                        child: Align(
                          alignment: Alignment.centerLeft,
                          child: Container(
                            decoration: const BoxDecoration(
                              border: Border(
                                top: BorderSide(
                                  color: Colors.grey,
                                  width: 1
                                ),
                                left: BorderSide(
                                  color: Colors.grey,
                                  width: 1
                                ),
                                right: BorderSide(
                                  color: Colors.grey,
                                  width: 1
                                ),
                                bottom: BorderSide(
                                  color: Colors.grey,
                                  width: 5
                                ),
                              )
                            ),
                            child: const TextField(
                            decoration: InputDecoration(
                              hintText: "Escreva aqui",
                              border: InputBorder.none,
                              contentPadding: EdgeInsets.all(10.0),
                            ),
                          ))
                        ),
                      )
                    ],
                  )),
                ),
              ),

              Padding(
                padding: const EdgeInsets.only(top: 20),
                child: SizedBox(
                  width: MediaQuery.of(context).size.width * 0.8,
                  height: MediaQuery.of(context).size.height * 0.4,
                  child: Container(
                    decoration: const BoxDecoration(
                      border: Border(
                        top: BorderSide(
                          color: Colors.grey,
                          width: 5
                        ),
                      )
                    ),
                    child: Column(children: [
                      const Padding(
                        padding: EdgeInsets.only(top: 20),
                        child: Align(
                          alignment: Alignment.centerLeft,
                          child: Text(
                            "Canal",
                            style: TextStyle(
                              fontSize: 20
                            ),
                          ),
                        )
                      ),

                      Padding(
                        padding: const EdgeInsets.only(top: 20),
                        child: Align(
                          alignment: Alignment.center,
                          child: Column(children: [
                            Padding(
                              padding: const EdgeInsets.only(top: 20),
                              child: Row(children: [
                                Radio<String>(
                                  value: "88,9 MHz",
                                  groupValue: _frequencyValue,
                                  onChanged: _handleFrequency,
                                ),
                                const Text(
                                  "88,9 MHz",
                                  style: TextStyle(
                                    color: Colors.grey,
                                    fontSize: 16
                                  )),
                              ],)
                            ),

                            Padding(
                              padding: const EdgeInsets.only(top: 10),
                              child: Row(children: [
                                Radio<String>(
                                  value: "89,7 MHz",
                                  groupValue: _frequencyValue,
                                  onChanged: _handleFrequency,
                                ),
                                const Text(
                                  "89,7 MHz",
                                  style: TextStyle(
                                    color: Colors.grey,
                                    fontSize: 16
                                  )
                                ),
                              ],),
                            ),

                            Padding(
                              padding: const EdgeInsets.only(top: 10),
                              child: Row(children: [
                                Radio<String>(
                                  value: "94,7 MHz",
                                  groupValue: _frequencyValue,
                                  onChanged: _handleFrequency,
                                ),
                                const Text(
                                  "94,7 MHz",
                                  style: TextStyle(
                                    color: Colors.grey,
                                    fontSize: 16
                                  )),
                              ],)
                            ),

                            Padding(
                              padding: const EdgeInsets.only(top: 10),
                              child: Row(children: [
                                Radio<String>(
                                  value: "101,7 MHz",
                                  groupValue: _frequencyValue,
                                  onChanged: _handleFrequency,
                                ),
                                const Text(
                                  "101,7 MHz",
                                  style: TextStyle(
                                    color: Colors.grey,
                                    fontSize: 16
                                  )
                                ),
                              ],)
                            )
                          ],)
                        ),
                      )
                    ],
                  )),
                ),
              ),
            ]),
          ),
        ),

        floatingActionButton: Column(
          mainAxisAlignment: MainAxisAlignment.end,
          children: [
            Padding(
              padding: const EdgeInsets.only(top: 20, bottom: 20),
              child: FloatingActionButton(
                backgroundColor: Colors.blue,
                onPressed: volumeUp,
                child: const Icon(Icons.add, color: Colors.white)
              ),
            ),

            Padding(
              padding: const EdgeInsets.only(top: 20, bottom: 20),
              child: FloatingActionButton(
                backgroundColor: Colors.blue,
                onPressed: volumeDown,
                child: const Icon(Icons.remove, color: Colors.white)
              ),
            ),
        ]),
      );
  }
}