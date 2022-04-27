package io.github.socraticphoenix.matrix.function;
public interface FromChar {
    interface ToObject<A> { A apply(char a); } 
    interface ToVoid { void apply(char a); } 
    interface ToBoolean { boolean apply(char a); } 
    interface ToByte { byte apply(char a); } 
    interface ToShort { short apply(char a); } 
    interface ToChar { char apply(char a); } 
    interface ToInt { int apply(char a); } 
    interface ToLong { long apply(char a); } 
    interface ToFloat { float apply(char a); } 
    interface ToDouble { double apply(char a); } 
    interface AndObject {
        interface ToObject<A, B> { A apply(char a, B b); } 
        interface ToVoid<A> { void apply(char a, A b); } 
        interface ToBoolean<A> { boolean apply(char a, A b); } 
        interface ToByte<A> { byte apply(char a, A b); } 
        interface ToShort<A> { short apply(char a, A b); } 
        interface ToChar<A> { char apply(char a, A b); } 
        interface ToInt<A> { int apply(char a, A b); } 
        interface ToLong<A> { long apply(char a, A b); } 
        interface ToFloat<A> { float apply(char a, A b); } 
        interface ToDouble<A> { double apply(char a, A b); } 
    }
    interface AndBoolean {
        interface ToObject<A> { A apply(char a, boolean b); } 
        interface ToVoid { void apply(char a, boolean b); } 
        interface ToBoolean { boolean apply(char a, boolean b); } 
        interface ToByte { byte apply(char a, boolean b); } 
        interface ToShort { short apply(char a, boolean b); } 
        interface ToChar { char apply(char a, boolean b); } 
        interface ToInt { int apply(char a, boolean b); } 
        interface ToLong { long apply(char a, boolean b); } 
        interface ToFloat { float apply(char a, boolean b); } 
        interface ToDouble { double apply(char a, boolean b); } 
    }
    interface AndByte {
        interface ToObject<A> { A apply(char a, byte b); } 
        interface ToVoid { void apply(char a, byte b); } 
        interface ToBoolean { boolean apply(char a, byte b); } 
        interface ToByte { byte apply(char a, byte b); } 
        interface ToShort { short apply(char a, byte b); } 
        interface ToChar { char apply(char a, byte b); } 
        interface ToInt { int apply(char a, byte b); } 
        interface ToLong { long apply(char a, byte b); } 
        interface ToFloat { float apply(char a, byte b); } 
        interface ToDouble { double apply(char a, byte b); } 
    }
    interface AndShort {
        interface ToObject<A> { A apply(char a, short b); } 
        interface ToVoid { void apply(char a, short b); } 
        interface ToBoolean { boolean apply(char a, short b); } 
        interface ToByte { byte apply(char a, short b); } 
        interface ToShort { short apply(char a, short b); } 
        interface ToChar { char apply(char a, short b); } 
        interface ToInt { int apply(char a, short b); } 
        interface ToLong { long apply(char a, short b); } 
        interface ToFloat { float apply(char a, short b); } 
        interface ToDouble { double apply(char a, short b); } 
    }
    interface AndChar {
        interface ToObject<A> { A apply(char a, char b); } 
        interface ToVoid { void apply(char a, char b); } 
        interface ToBoolean { boolean apply(char a, char b); } 
        interface ToByte { byte apply(char a, char b); } 
        interface ToShort { short apply(char a, char b); } 
        interface ToChar { char apply(char a, char b); } 
        interface ToInt { int apply(char a, char b); } 
        interface ToLong { long apply(char a, char b); } 
        interface ToFloat { float apply(char a, char b); } 
        interface ToDouble { double apply(char a, char b); } 
    }
    interface AndInt {
        interface ToObject<A> { A apply(char a, int b); } 
        interface ToVoid { void apply(char a, int b); } 
        interface ToBoolean { boolean apply(char a, int b); } 
        interface ToByte { byte apply(char a, int b); } 
        interface ToShort { short apply(char a, int b); } 
        interface ToChar { char apply(char a, int b); } 
        interface ToInt { int apply(char a, int b); } 
        interface ToLong { long apply(char a, int b); } 
        interface ToFloat { float apply(char a, int b); } 
        interface ToDouble { double apply(char a, int b); } 
    }
    interface AndLong {
        interface ToObject<A> { A apply(char a, long b); } 
        interface ToVoid { void apply(char a, long b); } 
        interface ToBoolean { boolean apply(char a, long b); } 
        interface ToByte { byte apply(char a, long b); } 
        interface ToShort { short apply(char a, long b); } 
        interface ToChar { char apply(char a, long b); } 
        interface ToInt { int apply(char a, long b); } 
        interface ToLong { long apply(char a, long b); } 
        interface ToFloat { float apply(char a, long b); } 
        interface ToDouble { double apply(char a, long b); } 
    }
    interface AndFloat {
        interface ToObject<A> { A apply(char a, float b); } 
        interface ToVoid { void apply(char a, float b); } 
        interface ToBoolean { boolean apply(char a, float b); } 
        interface ToByte { byte apply(char a, float b); } 
        interface ToShort { short apply(char a, float b); } 
        interface ToChar { char apply(char a, float b); } 
        interface ToInt { int apply(char a, float b); } 
        interface ToLong { long apply(char a, float b); } 
        interface ToFloat { float apply(char a, float b); } 
        interface ToDouble { double apply(char a, float b); } 
    }
    interface AndDouble {
        interface ToObject<A> { A apply(char a, double b); } 
        interface ToVoid { void apply(char a, double b); } 
        interface ToBoolean { boolean apply(char a, double b); } 
        interface ToByte { byte apply(char a, double b); } 
        interface ToShort { short apply(char a, double b); } 
        interface ToChar { char apply(char a, double b); } 
        interface ToInt { int apply(char a, double b); } 
        interface ToLong { long apply(char a, double b); } 
        interface ToFloat { float apply(char a, double b); } 
        interface ToDouble { double apply(char a, double b); } 
    }
}