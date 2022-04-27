package io.github.socraticphoenix.matrix.function;
public interface FromLong {
    interface ToObject<A> { A apply(long a); } 
    interface ToVoid { void apply(long a); } 
    interface ToBoolean { boolean apply(long a); } 
    interface ToByte { byte apply(long a); } 
    interface ToShort { short apply(long a); } 
    interface ToChar { char apply(long a); } 
    interface ToInt { int apply(long a); } 
    interface ToLong { long apply(long a); } 
    interface ToFloat { float apply(long a); } 
    interface ToDouble { double apply(long a); } 
    interface AndObject {
        interface ToObject<A, B> { A apply(long a, B b); } 
        interface ToVoid<A> { void apply(long a, A b); } 
        interface ToBoolean<A> { boolean apply(long a, A b); } 
        interface ToByte<A> { byte apply(long a, A b); } 
        interface ToShort<A> { short apply(long a, A b); } 
        interface ToChar<A> { char apply(long a, A b); } 
        interface ToInt<A> { int apply(long a, A b); } 
        interface ToLong<A> { long apply(long a, A b); } 
        interface ToFloat<A> { float apply(long a, A b); } 
        interface ToDouble<A> { double apply(long a, A b); } 
    }
    interface AndBoolean {
        interface ToObject<A> { A apply(long a, boolean b); } 
        interface ToVoid { void apply(long a, boolean b); } 
        interface ToBoolean { boolean apply(long a, boolean b); } 
        interface ToByte { byte apply(long a, boolean b); } 
        interface ToShort { short apply(long a, boolean b); } 
        interface ToChar { char apply(long a, boolean b); } 
        interface ToInt { int apply(long a, boolean b); } 
        interface ToLong { long apply(long a, boolean b); } 
        interface ToFloat { float apply(long a, boolean b); } 
        interface ToDouble { double apply(long a, boolean b); } 
    }
    interface AndByte {
        interface ToObject<A> { A apply(long a, byte b); } 
        interface ToVoid { void apply(long a, byte b); } 
        interface ToBoolean { boolean apply(long a, byte b); } 
        interface ToByte { byte apply(long a, byte b); } 
        interface ToShort { short apply(long a, byte b); } 
        interface ToChar { char apply(long a, byte b); } 
        interface ToInt { int apply(long a, byte b); } 
        interface ToLong { long apply(long a, byte b); } 
        interface ToFloat { float apply(long a, byte b); } 
        interface ToDouble { double apply(long a, byte b); } 
    }
    interface AndShort {
        interface ToObject<A> { A apply(long a, short b); } 
        interface ToVoid { void apply(long a, short b); } 
        interface ToBoolean { boolean apply(long a, short b); } 
        interface ToByte { byte apply(long a, short b); } 
        interface ToShort { short apply(long a, short b); } 
        interface ToChar { char apply(long a, short b); } 
        interface ToInt { int apply(long a, short b); } 
        interface ToLong { long apply(long a, short b); } 
        interface ToFloat { float apply(long a, short b); } 
        interface ToDouble { double apply(long a, short b); } 
    }
    interface AndChar {
        interface ToObject<A> { A apply(long a, char b); } 
        interface ToVoid { void apply(long a, char b); } 
        interface ToBoolean { boolean apply(long a, char b); } 
        interface ToByte { byte apply(long a, char b); } 
        interface ToShort { short apply(long a, char b); } 
        interface ToChar { char apply(long a, char b); } 
        interface ToInt { int apply(long a, char b); } 
        interface ToLong { long apply(long a, char b); } 
        interface ToFloat { float apply(long a, char b); } 
        interface ToDouble { double apply(long a, char b); } 
    }
    interface AndInt {
        interface ToObject<A> { A apply(long a, int b); } 
        interface ToVoid { void apply(long a, int b); } 
        interface ToBoolean { boolean apply(long a, int b); } 
        interface ToByte { byte apply(long a, int b); } 
        interface ToShort { short apply(long a, int b); } 
        interface ToChar { char apply(long a, int b); } 
        interface ToInt { int apply(long a, int b); } 
        interface ToLong { long apply(long a, int b); } 
        interface ToFloat { float apply(long a, int b); } 
        interface ToDouble { double apply(long a, int b); } 
    }
    interface AndLong {
        interface ToObject<A> { A apply(long a, long b); } 
        interface ToVoid { void apply(long a, long b); } 
        interface ToBoolean { boolean apply(long a, long b); } 
        interface ToByte { byte apply(long a, long b); } 
        interface ToShort { short apply(long a, long b); } 
        interface ToChar { char apply(long a, long b); } 
        interface ToInt { int apply(long a, long b); } 
        interface ToLong { long apply(long a, long b); } 
        interface ToFloat { float apply(long a, long b); } 
        interface ToDouble { double apply(long a, long b); } 
    }
    interface AndFloat {
        interface ToObject<A> { A apply(long a, float b); } 
        interface ToVoid { void apply(long a, float b); } 
        interface ToBoolean { boolean apply(long a, float b); } 
        interface ToByte { byte apply(long a, float b); } 
        interface ToShort { short apply(long a, float b); } 
        interface ToChar { char apply(long a, float b); } 
        interface ToInt { int apply(long a, float b); } 
        interface ToLong { long apply(long a, float b); } 
        interface ToFloat { float apply(long a, float b); } 
        interface ToDouble { double apply(long a, float b); } 
    }
    interface AndDouble {
        interface ToObject<A> { A apply(long a, double b); } 
        interface ToVoid { void apply(long a, double b); } 
        interface ToBoolean { boolean apply(long a, double b); } 
        interface ToByte { byte apply(long a, double b); } 
        interface ToShort { short apply(long a, double b); } 
        interface ToChar { char apply(long a, double b); } 
        interface ToInt { int apply(long a, double b); } 
        interface ToLong { long apply(long a, double b); } 
        interface ToFloat { float apply(long a, double b); } 
        interface ToDouble { double apply(long a, double b); } 
    }
}