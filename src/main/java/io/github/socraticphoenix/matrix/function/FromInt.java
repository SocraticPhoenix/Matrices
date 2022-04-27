package io.github.socraticphoenix.matrix.function;
public interface FromInt {
    interface ToObject<A> { A apply(int a); } 
    interface ToVoid { void apply(int a); } 
    interface ToBoolean { boolean apply(int a); } 
    interface ToByte { byte apply(int a); } 
    interface ToShort { short apply(int a); } 
    interface ToChar { char apply(int a); } 
    interface ToInt { int apply(int a); } 
    interface ToLong { long apply(int a); } 
    interface ToFloat { float apply(int a); } 
    interface ToDouble { double apply(int a); } 
    interface AndObject {
        interface ToObject<A, B> { A apply(int a, B b); } 
        interface ToVoid<A> { void apply(int a, A b); } 
        interface ToBoolean<A> { boolean apply(int a, A b); } 
        interface ToByte<A> { byte apply(int a, A b); } 
        interface ToShort<A> { short apply(int a, A b); } 
        interface ToChar<A> { char apply(int a, A b); } 
        interface ToInt<A> { int apply(int a, A b); } 
        interface ToLong<A> { long apply(int a, A b); } 
        interface ToFloat<A> { float apply(int a, A b); } 
        interface ToDouble<A> { double apply(int a, A b); } 
    }
    interface AndBoolean {
        interface ToObject<A> { A apply(int a, boolean b); } 
        interface ToVoid { void apply(int a, boolean b); } 
        interface ToBoolean { boolean apply(int a, boolean b); } 
        interface ToByte { byte apply(int a, boolean b); } 
        interface ToShort { short apply(int a, boolean b); } 
        interface ToChar { char apply(int a, boolean b); } 
        interface ToInt { int apply(int a, boolean b); } 
        interface ToLong { long apply(int a, boolean b); } 
        interface ToFloat { float apply(int a, boolean b); } 
        interface ToDouble { double apply(int a, boolean b); } 
    }
    interface AndByte {
        interface ToObject<A> { A apply(int a, byte b); } 
        interface ToVoid { void apply(int a, byte b); } 
        interface ToBoolean { boolean apply(int a, byte b); } 
        interface ToByte { byte apply(int a, byte b); } 
        interface ToShort { short apply(int a, byte b); } 
        interface ToChar { char apply(int a, byte b); } 
        interface ToInt { int apply(int a, byte b); } 
        interface ToLong { long apply(int a, byte b); } 
        interface ToFloat { float apply(int a, byte b); } 
        interface ToDouble { double apply(int a, byte b); } 
    }
    interface AndShort {
        interface ToObject<A> { A apply(int a, short b); } 
        interface ToVoid { void apply(int a, short b); } 
        interface ToBoolean { boolean apply(int a, short b); } 
        interface ToByte { byte apply(int a, short b); } 
        interface ToShort { short apply(int a, short b); } 
        interface ToChar { char apply(int a, short b); } 
        interface ToInt { int apply(int a, short b); } 
        interface ToLong { long apply(int a, short b); } 
        interface ToFloat { float apply(int a, short b); } 
        interface ToDouble { double apply(int a, short b); } 
    }
    interface AndChar {
        interface ToObject<A> { A apply(int a, char b); } 
        interface ToVoid { void apply(int a, char b); } 
        interface ToBoolean { boolean apply(int a, char b); } 
        interface ToByte { byte apply(int a, char b); } 
        interface ToShort { short apply(int a, char b); } 
        interface ToChar { char apply(int a, char b); } 
        interface ToInt { int apply(int a, char b); } 
        interface ToLong { long apply(int a, char b); } 
        interface ToFloat { float apply(int a, char b); } 
        interface ToDouble { double apply(int a, char b); } 
    }
    interface AndInt {
        interface ToObject<A> { A apply(int a, int b); } 
        interface ToVoid { void apply(int a, int b); } 
        interface ToBoolean { boolean apply(int a, int b); } 
        interface ToByte { byte apply(int a, int b); } 
        interface ToShort { short apply(int a, int b); } 
        interface ToChar { char apply(int a, int b); } 
        interface ToInt { int apply(int a, int b); } 
        interface ToLong { long apply(int a, int b); } 
        interface ToFloat { float apply(int a, int b); } 
        interface ToDouble { double apply(int a, int b); } 
    }
    interface AndLong {
        interface ToObject<A> { A apply(int a, long b); } 
        interface ToVoid { void apply(int a, long b); } 
        interface ToBoolean { boolean apply(int a, long b); } 
        interface ToByte { byte apply(int a, long b); } 
        interface ToShort { short apply(int a, long b); } 
        interface ToChar { char apply(int a, long b); } 
        interface ToInt { int apply(int a, long b); } 
        interface ToLong { long apply(int a, long b); } 
        interface ToFloat { float apply(int a, long b); } 
        interface ToDouble { double apply(int a, long b); } 
    }
    interface AndFloat {
        interface ToObject<A> { A apply(int a, float b); } 
        interface ToVoid { void apply(int a, float b); } 
        interface ToBoolean { boolean apply(int a, float b); } 
        interface ToByte { byte apply(int a, float b); } 
        interface ToShort { short apply(int a, float b); } 
        interface ToChar { char apply(int a, float b); } 
        interface ToInt { int apply(int a, float b); } 
        interface ToLong { long apply(int a, float b); } 
        interface ToFloat { float apply(int a, float b); } 
        interface ToDouble { double apply(int a, float b); } 
    }
    interface AndDouble {
        interface ToObject<A> { A apply(int a, double b); } 
        interface ToVoid { void apply(int a, double b); } 
        interface ToBoolean { boolean apply(int a, double b); } 
        interface ToByte { byte apply(int a, double b); } 
        interface ToShort { short apply(int a, double b); } 
        interface ToChar { char apply(int a, double b); } 
        interface ToInt { int apply(int a, double b); } 
        interface ToLong { long apply(int a, double b); } 
        interface ToFloat { float apply(int a, double b); } 
        interface ToDouble { double apply(int a, double b); } 
    }
}