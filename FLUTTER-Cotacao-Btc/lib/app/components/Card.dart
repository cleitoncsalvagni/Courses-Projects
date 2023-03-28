import 'package:cotacao_coins/app/components/PaisCotacao.dart';
import 'package:flutter/material.dart';

Widget CardValue (BuildContext context, String imagem){
  return Card(
      child: ListTile(
      leading:
      ClipRRect(
        borderRadius: BorderRadius.circular(8.0),
        child:
          PaisCotacao(image: 'assets/imagens-moedas/${imagem}.png',width: 50.0,),
      ),
      title:
        Text('0,00'),
        trailing: Icon(Icons.chevron_right),
      ),
  );
}
