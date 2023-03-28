import 'package:flutter/material.dart';
import 'package:meu_projeto/app/pages/galeria_page.dart';

import '../pages/counter_page.dart';
import '../pages/list_page.dart';


Widget Menu(BuildContext context){
  return Drawer(
      child: ListView(
          children: <Widget>[
            DrawerHeader(
                child: Text("Drawer Header")
            ),
            ListTile(
              title: Text("Contador"),
              onTap: (){
                Navigator.push(
                  context,
                  MaterialPageRoute(builder: (context) => CounterPage()),);
              },
            ),
            ListTile(
              title: Text("Lista"),
              onTap: (){
                Navigator.push(
                  context,
                  MaterialPageRoute(builder: (context) => ListPage()),);
              },
            ),
            ListTile(
              title: Text("Galeria"),
              onTap: (){
                Navigator.push(
                  context,
                  MaterialPageRoute(builder: (context) => Galeria()),);
              },
            ),
          ]
      )
  );
}
