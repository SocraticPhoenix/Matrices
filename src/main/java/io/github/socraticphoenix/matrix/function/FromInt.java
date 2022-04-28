package io.github.socraticphoenix.matrix.function;
public interface FromInt {
    interface ToObject<A> extends FromAny.ToObject { A apply(int a); } 
    interface ToVoid extends FromAny.ToVoid { void apply(int a); } 
    interface ToBoolean extends FromAny.ToBoolean { boolean apply(int a); } 
    interface ToByte extends FromAny.ToByte { byte apply(int a); } 
    interface ToShort extends FromAny.ToShort { short apply(int a); } 
    interface ToChar extends FromAny.ToChar { char apply(int a); } 
    interface ToInt extends FromAny.ToInt { int apply(int a); } 
    interface ToLong extends FromAny.ToLong { long apply(int a); } 
    interface ToFloat extends FromAny.ToFloat { float apply(int a); } 
    interface ToDouble extends FromAny.ToDouble { double apply(int a); } 
    interface AndObject {
        interface ToObject<A, B> extends FromAny.ToObject { A apply(int a, B b); } 
        interface ToVoid<A> extends FromAny.ToVoid { void apply(int a, A b); } 
        interface ToBoolean<A> extends FromAny.ToBoolean { boolean apply(int a, A b); } 
        interface ToByte<A> extends FromAny.ToByte { byte apply(int a, A b); } 
        interface ToShort<A> extends FromAny.ToShort { short apply(int a, A b); } 
        interface ToChar<A> extends FromAny.ToChar { char apply(int a, A b); } 
        interface ToInt<A> extends FromAny.ToInt { int apply(int a, A b); } 
        interface ToLong<A> extends FromAny.ToLong { long apply(int a, A b); } 
        interface ToFloat<A> extends FromAny.ToFloat { float apply(int a, A b); } 
        interface ToDouble<A> extends FromAny.ToDouble { double apply(int a, A b); } 
    }
    interface AndBoolean {
        interface ToObject<A> extends FromAny.ToObject { A apply(int a, boolean b); } 
        interface ToVoid extends FromAny.ToVoid { void apply(int a, boolean b); } 
        interface ToBoolean extends FromAny.ToBoolean { boolean apply(int a, boolean b); } 
        interface ToByte extends FromAny.ToByte { byte apply(int a, boolean b); } 
        interface ToShort extends FromAny.ToShort { short apply(int a, boolean b); } 
        interface ToChar extends FromAny.ToChar { char apply(int a, boolean b); } 
        interface ToInt extends FromAny.ToInt { int apply(int a, boolean b); } 
        interface ToLong extends FromAny.ToLong { long apply(int a, boolean b); } 
        interface ToFloat extends FromAny.ToFloat { float apply(int a, boolean b); } 
        interface ToDouble extends FromAny.ToDouble { double apply(int a, boolean b); } 
    }
    interface AndByte {
        interface ToObject<A> extends FromAny.ToObject { A apply(int a, byte b); } 
        interface ToVoid extends FromAny.ToVoid { void apply(int a, byte b); } 
        interface ToBoolean extends FromAny.ToBoolean { boolean apply(int a, byte b); } 
        interface ToByte extends FromAny.ToByte { byte apply(int a, byte b); } 
        interface ToShort extends FromAny.ToShort { short apply(int a, byte b); } 
        interface ToChar extends FromAny.ToChar { char apply(int a, byte b); } 
        interface ToInt extends FromAny.ToInt { int apply(int a, byte b); } 
        interface ToLong extends FromAny.ToLong { long apply(int a, byte b); } 
        interface ToFloat extends FromAny.ToFloat { float apply(int a, byte b); } 
        interface ToDouble extends FromAny.ToDouble { double apply(int a, byte b); } 
    }
    interface AndShort {
        interface ToObject<A> extends FromAny.ToObject { A apply(int a, short b); } 
        interface ToVoid extends FromAny.ToVoid { void apply(int a, short b); } 
        interface ToBoolean extends FromAny.ToBoolean { boolean apply(int a, short b); } 
        interface ToByte extends FromAny.ToByte { byte apply(int a, short b); } 
        interface ToShort extends FromAny.ToShort { short apply(int a, short b); } 
        interface ToChar extends FromAny.ToChar { char apply(int a, short b); } 
        interface ToInt extends FromAny.ToInt { int apply(int a, short b); } 
        interface ToLong extends FromAny.ToLong { long apply(int a, short b); } 
        interface ToFloat extends FromAny.ToFloat { float apply(int a, short b); } 
        interface ToDouble extends FromAny.ToDouble { double apply(int a, short b); } 
    }
    interface AndChar {
        interface ToObject<A> extends FromAny.ToObject { A apply(int a, char b); } 
        interface ToVoid extends FromAny.ToVoid { void apply(int a, char b); } 
        interface ToBoolean extends FromAny.ToBoolean { boolean apply(int a, char b); } 
        interface ToByte extends FromAny.ToByte { byte apply(int a, char b); } 
        interface ToShort extends FromAny.ToShort { short apply(int a, char b); } 
        interface ToChar extends FromAny.ToChar { char apply(int a, char b); } 
        interface ToInt extends FromAny.ToInt { int apply(int a, char b); } 
        interface ToLong extends FromAny.ToLong { long apply(int a, char b); } 
        interface ToFloat extends FromAny.ToFloat { float apply(int a, char b); } 
        interface ToDouble extends FromAny.ToDouble { double apply(int a, char b); } 
    }
    interface AndInt {
        interface ToObject<A> extends FromAny.ToObject { A apply(int a, int b); } 
        interface ToVoid extends FromAny.ToVoid { void apply(int a, int b); } 
        interface ToBoolean extends FromAny.ToBoolean { boolean apply(int a, int b); } 
        interface ToByte extends FromAny.ToByte { byte apply(int a, int b); } 
        interface ToShort extends FromAny.ToShort { short apply(int a, int b); } 
        interface ToChar extends FromAny.ToChar { char apply(int a, int b); } 
        interface ToInt extends FromAny.ToInt { int apply(int a, int b); } 
        interface ToLong extends FromAny.ToLong { long apply(int a, int b); } 
        interface ToFloat extends FromAny.ToFloat { float apply(int a, int b); } 
        interface ToDouble extends FromAny.ToDouble { double apply(int a, int b); } 
    }
    interface AndLong {
        interface ToObject<A> extends FromAny.ToObject { A apply(int a, long b); } 
        interface ToVoid extends FromAny.ToVoid { void apply(int a, long b); } 
        interface ToBoolean extends FromAny.ToBoolean { boolean apply(int a, long b); } 
        interface ToByte extends FromAny.ToByte { byte apply(int a, long b); } 
        interface ToShort extends FromAny.ToShort { short apply(int a, long b); } 
        interface ToChar extends FromAny.ToChar { char apply(int a, long b); } 
        interface ToInt extends FromAny.ToInt { int apply(int a, long b); } 
        interface ToLong extends FromAny.ToLong { long apply(int a, long b); } 
        interface ToFloat extends FromAny.ToFloat { float apply(int a, long b); } 
        interface ToDouble extends FromAny.ToDouble { double apply(int a, long b); } 
    }
    interface AndFloat {
        interface ToObject<A> extends FromAny.ToObject { A apply(int a, float b); } 
        interface ToVoid extends FromAny.ToVoid { void apply(int a, float b); } 
        interface ToBoolean extends FromAny.ToBoolean { boolean apply(int a, float b); } 
        interface ToByte extends FromAny.ToByte { byte apply(int a, float b); } 
        interface ToShort extends FromAny.ToShort { short apply(int a, float b); } 
        interface ToChar extends FromAny.ToChar { char apply(int a, float b); } 
        interface ToInt extends FromAny.ToInt { int apply(int a, float b); } 
        interface ToLong extends FromAny.ToLong { long apply(int a, float b); } 
        interface ToFloat extends FromAny.ToFloat { float apply(int a, float b); } 
        interface ToDouble extends FromAny.ToDouble { double apply(int a, float b); } 
    }
    interface AndDouble {
        interface ToObject<A> extends FromAny.ToObject { A apply(int a, double b); } 
        interface ToVoid extends FromAny.ToVoid { void apply(int a, double b); } 
        interface ToBoolean extends FromAny.ToBoolean { boolean apply(int a, double b); } 
        interface ToByte extends FromAny.ToByte { byte apply(int a, double b); } 
        interface ToShort extends FromAny.ToShort { short apply(int a, double b); } 
        interface ToChar extends FromAny.ToChar { char apply(int a, double b); } 
        interface ToInt extends FromAny.ToInt { int apply(int a, double b); } 
        interface ToLong extends FromAny.ToLong { long apply(int a, double b); } 
        interface ToFloat extends FromAny.ToFloat { float apply(int a, double b); } 
        interface ToDouble extends FromAny.ToDouble { double apply(int a, double b); } 
    }
}