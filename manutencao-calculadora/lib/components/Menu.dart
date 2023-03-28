
import 'package:flutter/material.dart';

import '../screens/About.dart';
import '../screens/Calculator.dart';

Widget Menu(BuildContext context){
  return Drawer(
      child: ListView(
          children: <Widget>[
            UserAccountsDrawerHeader(
              decoration: const BoxDecoration(color: Colors.blue),
              margin: const EdgeInsets.only(bottom: 10.0),
              currentAccountPicture: Container(
                decoration: const BoxDecoration(
                    shape: BoxShape.circle,
                    image: DecorationImage(
                        fit: BoxFit.fill,

                        image:
                        NetworkImage("https://www.pngall.com/wp-content/uploads/5/Profile-PNG-File.png"))),
              ),
              accountName: Container(
                  child: const Text(
                    'Cleiton',
                    style: TextStyle(color: Colors.white, fontWeight: FontWeight.bold),
                  )),
              accountEmail: Container(
                  child: const Text(
                    'cleiton@cleiton.com',
                    style: TextStyle(color: Colors.white),
                  )),
            ),
            ListTile(
              title: Text("Calculadora"),
              onTap: (){
                Navigator.push(
                  context,
                  MaterialPageRoute(builder: (context) => Calculadora()),);
              },
            ),
            ListTile(
              title: Text("Sobre"),
              onTap: (){
                Navigator.push(
                  context,
                  MaterialPageRoute(builder: (context) => About()),);
              },
            ),
          ]
      )
  );
}