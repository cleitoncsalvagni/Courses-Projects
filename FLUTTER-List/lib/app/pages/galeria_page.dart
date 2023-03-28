import 'package:flutter/cupertino.dart';
import 'package:flutter/material.dart';

class Galeria extends StatefulWidget {
  const Galeria({Key? key}) : super(key: key);


  @override
  State<Galeria> createState() => _GaleriaState();
}

class _GaleriaState extends State<Galeria> {

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        title: Text("Galeria"),
      ),
      body: Center(
          child: Column( children: [
            Container ( width: 500, height: 500, color: Colors.black,
              child:
              Image.network('assets/images/imagem.jpg'),
            ),
          ]),
      )
    );
  }
}