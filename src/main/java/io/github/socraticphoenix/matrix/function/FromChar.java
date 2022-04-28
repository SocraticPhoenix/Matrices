package io.github.socraticphoenix.matrix.function;
public interface FromChar {
    interface ToObject<A> extends FromAny.ToObject { A apply(char a); } 
    interface ToVoid extends FromAny.ToVoid { void apply(char a); } 
    interface ToBoolean extends FromAny.ToBoolean { boolean apply(char a); } 
    interface ToByte extends FromAny.ToByte { byte apply(char a); } 
    interface ToShort extends FromAny.ToShort { short apply(char a); } 
    interface ToChar extends FromAny.ToChar { char apply(char a); } 
    interface ToInt extends FromAny.ToInt { int apply(char a); } 
    interface ToLong extends FromAny.ToLong { long apply(char a); } 
    interface ToFloat extends FromAny.ToFloat { float apply(char a); } 
    interface ToDouble extends FromAny.ToDouble { double apply(char a); } 
    interface AndObject {
        interface ToObject<A, B> extends FromAny.ToObject { A apply(char a, B b); } 
        interface ToVoid<A> extends FromAny.ToVoid { void apply(char a, A b); } 
        interface ToBoolean<A> extends FromAny.ToBoolean { boolean apply(char a, A b); } 
        interface ToByte<A> extends FromAny.ToByte { byte apply(char a, A b); } 
        interface ToShort<A> extends FromAny.ToShort { short apply(char a, A b); } 
        interface ToChar<A> extends FromAny.ToChar { char apply(char a, A b); } 
        interface ToInt<A> extends FromAny.ToInt { int apply(char a, A b); } 
        interface ToLong<A> extends FromAny.ToLong { long apply(char a, A b); } 
        interface ToFloat<A> extends FromAny.ToFloat { float apply(char a, A b); } 
        interface ToDouble<A> extends FromAny.ToDouble { double apply(char a, A b); } 
    }
    interface AndBoolean {
        interface ToObject<A> extends FromAny.ToObject { A apply(char a, boolean b); } 
        interface ToVoid extends FromAny.ToVoid { void apply(char a, boolean b); } 
        interface ToBoolean extends FromAny.ToBoolean { boolean apply(char a, boolean b); } 
        interface ToByte extends FromAny.ToByte { byte apply(char a, boolean b); } 
        interface ToShort extends FromAny.ToShort { short apply(char a, boolean b); } 
        interface ToChar extends FromAny.ToChar { char apply(char a, boolean b); } 
        interface ToInt extends FromAny.ToInt { int apply(char a, boolean b); } 
        interface ToLong extends FromAny.ToLong { long apply(char a, boolean b); } 
        interface ToFloat extends FromAny.ToFloat { float apply(char a, boolean b); } 
        interface ToDouble extends FromAny.ToDouble { double apply(char a, boolean b); } 
    }
    interface AndByte {
        interface ToObject<A> extends FromAny.ToObject { A apply(char a, byte b); } 
        interface ToVoid extends FromAny.ToVoid { void apply(char a, byte b); } 
        interface ToBoolean extends FromAny.ToBoolean { boolean apply(char a, byte b); } 
        interface ToByte extends FromAny.ToByte { byte apply(char a, byte b); } 
        interface ToShort extends FromAny.ToShort { short apply(char a, byte b); } 
        interface ToChar extends FromAny.ToChar { char apply(char a, byte b); } 
        interface ToInt extends FromAny.ToInt { int apply(char a, byte b); } 
        interface ToLong extends FromAny.ToLong { long apply(char a, byte b); } 
        interface ToFloat extends FromAny.ToFloat { float apply(char a, byte b); } 
        interface ToDouble extends FromAny.ToDouble { double apply(char a, byte b); } 
    }
    interface AndShort {
        interface ToObject<A> extends FromAny.ToObject { A apply(char a, short b); } 
        interface ToVoid extends FromAny.ToVoid { void apply(char a, short b); } 
        interface ToBoolean extends FromAny.ToBoolean { boolean apply(char a, short b); } 
        interface ToByte extends FromAny.ToByte { byte apply(char a, short b); } 
        interface ToShort extends FromAny.ToShort { short apply(char a, short b); } 
        interface ToChar extends FromAny.ToChar { char apply(char a, short b); } 
        interface ToInt extends FromAny.ToInt { int apply(char a, short b); } 
        interface ToLong extends FromAny.ToLong { long apply(char a, short b); } 
        interface ToFloat extends FromAny.ToFloat { float apply(char a, short b); } 
        interface ToDouble extends FromAny.ToDouble { double apply(char a, short b); } 
    }
    interface AndChar {
        interface ToObject<A> extends FromAny.ToObject { A apply(char a, char b); } 
        interface ToVoid extends FromAny.ToVoid { void apply(char a, char b); } 
        interface ToBoolean extends FromAny.ToBoolean { boolean apply(char a, char b); } 
        interface ToByte extends FromAny.ToByte { byte apply(char a, char b); } 
        interface ToShort extends FromAny.ToShort { short apply(char a, char b); } 
        interface ToChar extends FromAny.ToChar { char apply(char a, char b); } 
        interface ToInt extends FromAny.ToInt { int apply(char a, char b); } 
        interface ToLong extends FromAny.ToLong { long apply(char a, char b); } 
        interface ToFloat extends FromAny.ToFloat { float apply(char a, char b); } 
        interface ToDouble extends FromAny.ToDouble { double apply(char a, char b); } 
    }
    interface AndInt {
        interface ToObject<A> extends FromAny.ToObject { A apply(char a, int b); } 
        interface ToVoid extends FromAny.ToVoid { void apply(char a, int b); } 
        interface ToBoolean extends FromAny.ToBoolean { boolean apply(char a, int b); } 
        interface ToByte extends FromAny.ToByte { byte apply(char a, int b); } 
        interface ToShort extends FromAny.ToShort { short apply(char a, int b); } 
        interface ToChar extends FromAny.ToChar { char apply(char a, int b); } 
        interface ToInt extends FromAny.ToInt { int apply(char a, int b); } 
        interface ToLong extends FromAny.ToLong { long apply(char a, int b); } 
        interface ToFloat extends FromAny.ToFloat { float apply(char a, int b); } 
        interface ToDouble extends FromAny.ToDouble { double apply(char a, int b); } 
    }
    interface AndLong {
        interface ToObject<A> extends FromAny.ToObject { A apply(char a, long b); } 
        interface ToVoid extends FromAny.ToVoid { void apply(char a, long b); } 
        interface ToBoolean extends FromAny.ToBoolean { boolean apply(char a, long b); } 
        interface ToByte extends FromAny.ToByte { byte apply(char a, long b); } 
        interface ToShort extends FromAny.ToShort { short apply(char a, long b); } 
        interface ToChar extends FromAny.ToChar { char apply(char a, long b); } 
        interface ToInt extends FromAny.ToInt { int apply(char a, long b); } 
        interface ToLong extends FromAny.ToLong { long apply(char a, long b); } 
        interface ToFloat extends FromAny.ToFloat { float apply(char a, long b); } 
        interface ToDouble extends FromAny.ToDouble { double apply(char a, long b); } 
    }
    interface AndFloat {
        interface ToObject<A> extends FromAny.ToObject { A apply(char a, float b); } 
        interface ToVoid extends FromAny.ToVoid { void apply(char a, float b); } 
        interface ToBoolean extends FromAny.ToBoolean { boolean apply(char a, float b); } 
        interface ToByte extends FromAny.ToByte { byte apply(char a, float b); } 
        interface ToShort extends FromAny.ToShort { short apply(char a, float b); } 
        interface ToChar extends FromAny.ToChar { char apply(char a, float b); } 
        interface ToInt extends FromAny.ToInt { int apply(char a, float b); } 
        interface ToLong extends FromAny.ToLong { long apply(char a, float b); } 
        interface ToFloat extends FromAny.ToFloat { float apply(char a, float b); } 
        interface ToDouble extends FromAny.ToDouble { double apply(char a, float b); } 
    }
    interface AndDouble {
        interface ToObject<A> extends FromAny.ToObject { A apply(char a, double b); } 
        interface ToVoid extends FromAny.ToVoid { void apply(char a, double b); } 
        interface ToBoolean extends FromAny.ToBoolean { boolean apply(char a, double b); } 
        interface ToByte extends FromAny.ToByte { byte apply(char a, double b); } 
        interface ToShort extends FromAny.ToShort { short apply(char a, double b); } 
        interface ToChar extends FromAny.ToChar { char apply(char a, double b); } 
        interface ToInt extends FromAny.ToInt { int apply(char a, double b); } 
        interface ToLong extends FromAny.ToLong { long apply(char a, double b); } 
        interface ToFloat extends FromAny.ToFloat { float apply(char a, double b); } 
        interface ToDouble extends FromAny.ToDouble { double apply(char a, double b); } 
    }
}