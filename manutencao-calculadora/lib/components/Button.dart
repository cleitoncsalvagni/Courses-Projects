import 'package:flutter/material.dart';

Widget Button(BuildContext context, void Function()? onPressed, String text, String color) {
  return MaterialButton(
    onPressed: onPressed,
    color: color == 'gray' ? Colors.black54 : Colors.blue,
    textColor: Colors.white,
    padding: const EdgeInsets.all(42),
    shape: const CircleBorder(),
    child: Text(text),
  );
}