import 'package:flutter/material.dart';
import 'package:flutter/cupertino.dart';
import 'package:cotacao_coins/app/components/Menu.dart';
import 'package:cotacao_coins/app/components/Card.dart';

class Home extends StatefulWidget {
  const Home({Key? key}) : super(key: key);


  @override
  State<Home> createState() => _HomePageState();
}

class _HomePageState extends State<Home> {
  @override
  Widget build(BuildContext context) {

    return Scaffold(
      appBar: AppBar(
        title: Text("Cotação compra BTC"),
    ),
      drawer: Menu(context),
        body: SingleChildScrollView(
          child: Column(
              children: <Widget>[
                CardValue(context, 'brl'),
                CardValue(context, 'eur'),
                CardValue(context, 'inr'),
                CardValue(context, 'jpy'),
                CardValue(context, 'pln'),
                CardValue(context, 'try'),
              ]
          ),
        )
    );
  }
}