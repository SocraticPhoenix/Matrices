package io.github.socraticphoenix.matrix.function;
public interface FromObject {
    interface ToObject<A, B> extends FromAny.ToObject { A apply(B a); } 
    interface ToVoid<A> extends FromAny.ToVoid { void apply(A a); } 
    interface ToBoolean<A> extends FromAny.ToBoolean { boolean apply(A a); } 
    interface ToByte<A> extends FromAny.ToByte { byte apply(A a); } 
    interface ToShort<A> extends FromAny.ToShort { short apply(A a); } 
    interface ToChar<A> extends FromAny.ToChar { char apply(A a); } 
    interface ToInt<A> extends FromAny.ToInt { int apply(A a); } 
    interface ToLong<A> extends FromAny.ToLong { long apply(A a); } 
    interface ToFloat<A> extends FromAny.ToFloat { float apply(A a); } 
    interface ToDouble<A> extends FromAny.ToDouble { double apply(A a); } 
    interface AndObject {
        interface ToObject<A, B, C> extends FromAny.ToObject { A apply(B a, C b); } 
        interface ToVoid<A, B> extends FromAny.ToVoid { void apply(A a, B b); } 
        interface ToBoolean<A, B> extends FromAny.ToBoolean { boolean apply(A a, B b); } 
        interface ToByte<A, B> extends FromAny.ToByte { byte apply(A a, B b); } 
        interface ToShort<A, B> extends FromAny.ToShort { short apply(A a, B b); } 
        interface ToChar<A, B> extends FromAny.ToChar { char apply(A a, B b); } 
        interface ToInt<A, B> extends FromAny.ToInt { int apply(A a, B b); } 
        interface ToLong<A, B> extends FromAny.ToLong { long apply(A a, B b); } 
        interface ToFloat<A, B> extends FromAny.ToFloat { float apply(A a, B b); } 
        interface ToDouble<A, B> extends FromAny.ToDouble { double apply(A a, B b); } 
    }
    interface AndBoolean {
        interface ToObject<A, B> extends FromAny.ToObject { A apply(B a, boolean b); } 
        interface ToVoid<A> extends FromAny.ToVoid { void apply(A a, boolean b); } 
        interface ToBoolean<A> extends FromAny.ToBoolean { boolean apply(A a, boolean b); } 
        interface ToByte<A> extends FromAny.ToByte { byte apply(A a, boolean b); } 
        interface ToShort<A> extends FromAny.ToShort { short apply(A a, boolean b); } 
        interface ToChar<A> extends FromAny.ToChar { char apply(A a, boolean b); } 
        interface ToInt<A> extends FromAny.ToInt { int apply(A a, boolean b); } 
        interface ToLong<A> extends FromAny.ToLong { long apply(A a, boolean b); } 
        interface ToFloat<A> extends FromAny.ToFloat { float apply(A a, boolean b); } 
        interface ToDouble<A> extends FromAny.ToDouble { double apply(A a, boolean b); } 
    }
    interface AndByte {
        interface ToObject<A, B> extends FromAny.ToObject { A apply(B a, byte b); } 
        interface ToVoid<A> extends FromAny.ToVoid { void apply(A a, byte b); } 
        interface ToBoolean<A> extends FromAny.ToBoolean { boolean apply(A a, byte b); } 
        interface ToByte<A> extends FromAny.ToByte { byte apply(A a, byte b); } 
        interface ToShort<A> extends FromAny.ToShort { short apply(A a, byte b); } 
        interface ToChar<A> extends FromAny.ToChar { char apply(A a, byte b); } 
        interface ToInt<A> extends FromAny.ToInt { int apply(A a, byte b); } 
        interface ToLong<A> extends FromAny.ToLong { long apply(A a, byte b); } 
        interface ToFloat<A> extends FromAny.ToFloat { float apply(A a, byte b); } 
        interface ToDouble<A> extends FromAny.ToDouble { double apply(A a, byte b); } 
    }
    interface AndShort {
        interface ToObject<A, B> extends FromAny.ToObject { A apply(B a, short b); } 
        interface ToVoid<A> extends FromAny.ToVoid { void apply(A a, short b); } 
        interface ToBoolean<A> extends FromAny.ToBoolean { boolean apply(A a, short b); } 
        interface ToByte<A> extends FromAny.ToByte { byte apply(A a, short b); } 
        interface ToShort<A> extends FromAny.ToShort { short apply(A a, short b); } 
        interface ToChar<A> extends FromAny.ToChar { char apply(A a, short b); } 
        interface ToInt<A> extends FromAny.ToInt { int apply(A a, short b); } 
        interface ToLong<A> extends FromAny.ToLong { long apply(A a, short b); } 
        interface ToFloat<A> extends FromAny.ToFloat { float apply(A a, short b); } 
        interface ToDouble<A> extends FromAny.ToDouble { double apply(A a, short b); } 
    }
    interface AndChar {
        interface ToObject<A, B> extends FromAny.ToObject { A apply(B a, char b); } 
        interface ToVoid<A> extends FromAny.ToVoid { void apply(A a, char b); } 
        interface ToBoolean<A> extends FromAny.ToBoolean { boolean apply(A a, char b); } 
        interface ToByte<A> extends FromAny.ToByte { byte apply(A a, char b); } 
        interface ToShort<A> extends FromAny.ToShort { short apply(A a, char b); } 
        interface ToChar<A> extends FromAny.ToChar { char apply(A a, char b); } 
        interface ToInt<A> extends FromAny.ToInt { int apply(A a, char b); } 
        interface ToLong<A> extends FromAny.ToLong { long apply(A a, char b); } 
        interface ToFloat<A> extends FromAny.ToFloat { float apply(A a, char b); } 
        interface ToDouble<A> extends FromAny.ToDouble { double apply(A a, char b); } 
    }
    interface AndInt {
        interface ToObject<A, B> extends FromAny.ToObject { A apply(B a, int b); } 
        interface ToVoid<A> extends FromAny.ToVoid { void apply(A a, int b); } 
        interface ToBoolean<A> extends FromAny.ToBoolean { boolean apply(A a, int b); } 
        interface ToByte<A> extends FromAny.ToByte { byte apply(A a, int b); } 
        interface ToShort<A> extends FromAny.ToShort { short apply(A a, int b); } 
        interface ToChar<A> extends FromAny.ToChar { char apply(A a, int b); } 
        interface ToInt<A> extends FromAny.ToInt { int apply(A a, int b); } 
        interface ToLong<A> extends FromAny.ToLong { long apply(A a, int b); } 
        interface ToFloat<A> extends FromAny.ToFloat { float apply(A a, int b); } 
        interface ToDouble<A> extends FromAny.ToDouble { double apply(A a, int b); } 
    }
    interface AndLong {
        interface ToObject<A, B> extends FromAny.ToObject { A apply(B a, long b); } 
        interface ToVoid<A> extends FromAny.ToVoid { void apply(A a, long b); } 
        interface ToBoolean<A> extends FromAny.ToBoolean { boolean apply(A a, long b); } 
        interface ToByte<A> extends FromAny.ToByte { byte apply(A a, long b); } 
        interface ToShort<A> extends FromAny.ToShort { short apply(A a, long b); } 
        interface ToChar<A> extends FromAny.ToChar { char apply(A a, long b); } 
        interface ToInt<A> extends FromAny.ToInt { int apply(A a, long b); } 
        interface ToLong<A> extends FromAny.ToLong { long apply(A a, long b); } 
        interface ToFloat<A> extends FromAny.ToFloat { float apply(A a, long b); } 
        interface ToDouble<A> extends FromAny.ToDouble { double apply(A a, long b); } 
    }
    interface AndFloat {
        interface ToObject<A, B> extends FromAny.ToObject { A apply(B a, float b); } 
        interface ToVoid<A> extends FromAny.ToVoid { void apply(A a, float b); } 
        interface ToBoolean<A> extends FromAny.ToBoolean { boolean apply(A a, float b); } 
        interface ToByte<A> extends FromAny.ToByte { byte apply(A a, float b); } 
        interface ToShort<A> extends FromAny.ToShort { short apply(A a, float b); } 
        interface ToChar<A> extends FromAny.ToChar { char apply(A a, float b); } 
        interface ToInt<A> extends FromAny.ToInt { int apply(A a, float b); } 
        interface ToLong<A> extends FromAny.ToLong { long apply(A a, float b); } 
        interface ToFloat<A> extends FromAny.ToFloat { float apply(A a, float b); } 
        interface ToDouble<A> extends FromAny.ToDouble { double apply(A a, float b); } 
    }
    interface AndDouble {
        interface ToObject<A, B> extends FromAny.ToObject { A apply(B a, double b); } 
        interface ToVoid<A> extends FromAny.ToVoid { void apply(A a, double b); } 
        interface ToBoolean<A> extends FromAny.ToBoolean { boolean apply(A a, double b); } 
        interface ToByte<A> extends FromAny.ToByte { byte apply(A a, double b); } 
        interface ToShort<A> extends FromAny.ToShort { short apply(A a, double b); } 
        interface ToChar<A> extends FromAny.ToChar { char apply(A a, double b); } 
        interface ToInt<A> extends FromAny.ToInt { int apply(A a, double b); } 
        interface ToLong<A> extends FromAny.ToLong { long apply(A a, double b); } 
        interface ToFloat<A> extends FromAny.ToFloat { float apply(A a, double b); } 
        interface ToDouble<A> extends FromAny.ToDouble { double apply(A a, double b); } 
    }
}