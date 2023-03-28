import 'package:flutter/material.dart';
import 'package:cotacao_coins/app/screens/Home.dart';

Widget Menu(BuildContext context){

  String profileImage = 'assets/imagens-moedas/brl.png';

  return Drawer(
      child: ListView(
          children: <Widget>[
            UserAccountsDrawerHeader(
              decoration: BoxDecoration(color: Colors.green),
              margin: EdgeInsets.only(bottom: 10.0),
              currentAccountPicture: Container(
                decoration: BoxDecoration(
                    shape: BoxShape.circle,
                    image: DecorationImage(
                        fit: BoxFit.fill,

                        image:
                        NetworkImage(profileImage))),
              ),
              accountName: new Container(
                  child: Text(
                    'Cleiton',
                    style: TextStyle(color: Colors.white, fontWeight: FontWeight.bold),
                  )),
              accountEmail: new Container(
                  child: Text(
                    'cleiton@cleiton.com',
                    style: TextStyle(color: Colors.white),
                  )),
            ),
            ListTile(
              title: Text("Recarregar"),
              onTap: (){
                Navigator.push(
                  context,
                  MaterialPageRoute(builder: (context) => Home()),);
              },
            ),
          ]
      )
  );
}
