package io.github.socraticphoenix.matrix.function;
public interface FromShort {
    interface ToObject<A> extends FromAny.ToObject { A apply(short a); } 
    interface ToVoid extends FromAny.ToVoid { void apply(short a); } 
    interface ToBoolean extends FromAny.ToBoolean { boolean apply(short a); } 
    interface ToByte extends FromAny.ToByte { byte apply(short a); } 
    interface ToShort extends FromAny.ToShort { short apply(short a); } 
    interface ToChar extends FromAny.ToChar { char apply(short a); } 
    interface ToInt extends FromAny.ToInt { int apply(short a); } 
    interface ToLong extends FromAny.ToLong { long apply(short a); } 
    interface ToFloat extends FromAny.ToFloat { float apply(short a); } 
    interface ToDouble extends FromAny.ToDouble { double apply(short a); } 
    interface AndObject {
        interface ToObject<A, B> extends FromAny.ToObject { A apply(short a, B b); } 
        interface ToVoid<A> extends FromAny.ToVoid { void apply(short a, A b); } 
        interface ToBoolean<A> extends FromAny.ToBoolean { boolean apply(short a, A b); } 
        interface ToByte<A> extends FromAny.ToByte { byte apply(short a, A b); } 
        interface ToShort<A> extends FromAny.ToShort { short apply(short a, A b); } 
        interface ToChar<A> extends FromAny.ToChar { char apply(short a, A b); } 
        interface ToInt<A> extends FromAny.ToInt { int apply(short a, A b); } 
        interface ToLong<A> extends FromAny.ToLong { long apply(short a, A b); } 
        interface ToFloat<A> extends FromAny.ToFloat { float apply(short a, A b); } 
        interface ToDouble<A> extends FromAny.ToDouble { double apply(short a, A b); } 
    }
    interface AndBoolean {
        interface ToObject<A> extends FromAny.ToObject { A apply(short a, boolean b); } 
        interface ToVoid extends FromAny.ToVoid { void apply(short a, boolean b); } 
        interface ToBoolean extends FromAny.ToBoolean { boolean apply(short a, boolean b); } 
        interface ToByte extends FromAny.ToByte { byte apply(short a, boolean b); } 
        interface ToShort extends FromAny.ToShort { short apply(short a, boolean b); } 
        interface ToChar extends FromAny.ToChar { char apply(short a, boolean b); } 
        interface ToInt extends FromAny.ToInt { int apply(short a, boolean b); } 
        interface ToLong extends FromAny.ToLong { long apply(short a, boolean b); } 
        interface ToFloat extends FromAny.ToFloat { float apply(short a, boolean b); } 
        interface ToDouble extends FromAny.ToDouble { double apply(short a, boolean b); } 
    }
    interface AndByte {
        interface ToObject<A> extends FromAny.ToObject { A apply(short a, byte b); } 
        interface ToVoid extends FromAny.ToVoid { void apply(short a, byte b); } 
        interface ToBoolean extends FromAny.ToBoolean { boolean apply(short a, byte b); } 
        interface ToByte extends FromAny.ToByte { byte apply(short a, byte b); } 
        interface ToShort extends FromAny.ToShort { short apply(short a, byte b); } 
        interface ToChar extends FromAny.ToChar { char apply(short a, byte b); } 
        interface ToInt extends FromAny.ToInt { int apply(short a, byte b); } 
        interface ToLong extends FromAny.ToLong { long apply(short a, byte b); } 
        interface ToFloat extends FromAny.ToFloat { float apply(short a, byte b); } 
        interface ToDouble extends FromAny.ToDouble { double apply(short a, byte b); } 
    }
    interface AndShort {
        interface ToObject<A> extends FromAny.ToObject { A apply(short a, short b); } 
        interface ToVoid extends FromAny.ToVoid { void apply(short a, short b); } 
        interface ToBoolean extends FromAny.ToBoolean { boolean apply(short a, short b); } 
        interface ToByte extends FromAny.ToByte { byte apply(short a, short b); } 
        interface ToShort extends FromAny.ToShort { short apply(short a, short b); } 
        interface ToChar extends FromAny.ToChar { char apply(short a, short b); } 
        interface ToInt extends FromAny.ToInt { int apply(short a, short b); } 
        interface ToLong extends FromAny.ToLong { long apply(short a, short b); } 
        interface ToFloat extends FromAny.ToFloat { float apply(short a, short b); } 
        interface ToDouble extends FromAny.ToDouble { double apply(short a, short b); } 
    }
    interface AndChar {
        interface ToObject<A> extends FromAny.ToObject { A apply(short a, char b); } 
        interface ToVoid extends FromAny.ToVoid { void apply(short a, char b); } 
        interface ToBoolean extends FromAny.ToBoolean { boolean apply(short a, char b); } 
        interface ToByte extends FromAny.ToByte { byte apply(short a, char b); } 
        interface ToShort extends FromAny.ToShort { short apply(short a, char b); } 
        interface ToChar extends FromAny.ToChar { char apply(short a, char b); } 
        interface ToInt extends FromAny.ToInt { int apply(short a, char b); } 
        interface ToLong extends FromAny.ToLong { long apply(short a, char b); } 
        interface ToFloat extends FromAny.ToFloat { float apply(short a, char b); } 
        interface ToDouble extends FromAny.ToDouble { double apply(short a, char b); } 
    }
    interface AndInt {
        interface ToObject<A> extends FromAny.ToObject { A apply(short a, int b); } 
        interface ToVoid extends FromAny.ToVoid { void apply(short a, int b); } 
        interface ToBoolean extends FromAny.ToBoolean { boolean apply(short a, int b); } 
        interface ToByte extends FromAny.ToByte { byte apply(short a, int b); } 
        interface ToShort extends FromAny.ToShort { short apply(short a, int b); } 
        interface ToChar extends FromAny.ToChar { char apply(short a, int b); } 
        interface ToInt extends FromAny.ToInt { int apply(short a, int b); } 
        interface ToLong extends FromAny.ToLong { long apply(short a, int b); } 
        interface ToFloat extends FromAny.ToFloat { float apply(short a, int b); } 
        interface ToDouble extends FromAny.ToDouble { double apply(short a, int b); } 
    }
    interface AndLong {
        interface ToObject<A> extends FromAny.ToObject { A apply(short a, long b); } 
        interface ToVoid extends FromAny.ToVoid { void apply(short a, long b); } 
        interface ToBoolean extends FromAny.ToBoolean { boolean apply(short a, long b); } 
        interface ToByte extends FromAny.ToByte { byte apply(short a, long b); } 
        interface ToShort extends FromAny.ToShort { short apply(short a, long b); } 
        interface ToChar extends FromAny.ToChar { char apply(short a, long b); } 
        interface ToInt extends FromAny.ToInt { int apply(short a, long b); } 
        interface ToLong extends FromAny.ToLong { long apply(short a, long b); } 
        interface ToFloat extends FromAny.ToFloat { float apply(short a, long b); } 
        interface ToDouble extends FromAny.ToDouble { double apply(short a, long b); } 
    }
    interface AndFloat {
        interface ToObject<A> extends FromAny.ToObject { A apply(short a, float b); } 
        interface ToVoid extends FromAny.ToVoid { void apply(short a, float b); } 
        interface ToBoolean extends FromAny.ToBoolean { boolean apply(short a, float b); } 
        interface ToByte extends FromAny.ToByte { byte apply(short a, float b); } 
        interface ToShort extends FromAny.ToShort { short apply(short a, float b); } 
        interface ToChar extends FromAny.ToChar { char apply(short a, float b); } 
        interface ToInt extends FromAny.ToInt { int apply(short a, float b); } 
        interface ToLong extends FromAny.ToLong { long apply(short a, float b); } 
        interface ToFloat extends FromAny.ToFloat { float apply(short a, float b); } 
        interface ToDouble extends FromAny.ToDouble { double apply(short a, float b); } 
    }
    interface AndDouble {
        interface ToObject<A> extends FromAny.ToObject { A apply(short a, double b); } 
        interface ToVoid extends FromAny.ToVoid { void apply(short a, double b); } 
        interface ToBoolean extends FromAny.ToBoolean { boolean apply(short a, double b); } 
        interface ToByte extends FromAny.ToByte { byte apply(short a, double b); } 
        interface ToShort extends FromAny.ToShort { short apply(short a, double b); } 
        interface ToChar extends FromAny.ToChar { char apply(short a, double b); } 
        interface ToInt extends FromAny.ToInt { int apply(short a, double b); } 
        interface ToLong extends FromAny.ToLong { long apply(short a, double b); } 
        interface ToFloat extends FromAny.ToFloat { float apply(short a, double b); } 
        interface ToDouble extends FromAny.ToDouble { double apply(short a, double b); } 
    }
}