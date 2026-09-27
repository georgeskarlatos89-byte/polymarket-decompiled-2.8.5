package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.socure.docv.capturesdk.common.utils.ConstantsKt;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class t1o implements Parcelable.Creator {
    public final /* synthetic */ int a;

    public /* synthetic */ t1o(int i) {
        this.a = i;
    }

    /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, g5, k2e] */
    /* JADX WARN: Type inference failed for: r0v19, types: [e0n, java.lang.Object, g5] */
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int readInt;
        int i = 0;
        String str = null;
        switch (this.a) {
            case 0:
                int v = fxn.v(parcel);
                String str2 = null;
                String str3 = null;
                while (parcel.dataPosition() < v) {
                    int readInt2 = parcel.readInt();
                    char c = (char) readInt2;
                    if (c != 1) {
                        if (c != 2) {
                            if (c != 3) {
                                if (c != 4) {
                                    fxn.u(parcel, readInt2);
                                } else {
                                    str3 = fxn.g(parcel, readInt2);
                                }
                            } else {
                                str2 = fxn.g(parcel, readInt2);
                            }
                        } else {
                            str = fxn.g(parcel, readInt2);
                        }
                    } else {
                        i = fxn.q(parcel, readInt2);
                    }
                }
                fxn.l(parcel, v);
                return new x0o(i, str, str2, str3);
            case 1:
                int v2 = fxn.v(parcel);
                double d = ConstantsKt.UNSET;
                double d2 = 0.0d;
                while (parcel.dataPosition() < v2) {
                    int readInt3 = parcel.readInt();
                    char c2 = (char) readInt3;
                    if (c2 != 1) {
                        if (c2 != 2) {
                            fxn.u(parcel, readInt3);
                        } else {
                            d2 = fxn.n(parcel, readInt3);
                        }
                    } else {
                        d = fxn.n(parcel, readInt3);
                    }
                }
                fxn.l(parcel, v2);
                return new y0o(d, d2);
            case 2:
                int v3 = fxn.v(parcel);
                String str4 = null;
                String str5 = null;
                String str6 = null;
                String str7 = null;
                String str8 = null;
                String str9 = null;
                String str10 = null;
                while (parcel.dataPosition() < v3) {
                    int readInt4 = parcel.readInt();
                    switch ((char) readInt4) {
                        case 1:
                            str4 = fxn.g(parcel, readInt4);
                            break;
                        case 2:
                            str5 = fxn.g(parcel, readInt4);
                            break;
                        case 3:
                            str6 = fxn.g(parcel, readInt4);
                            break;
                        case 4:
                            str7 = fxn.g(parcel, readInt4);
                            break;
                        case 5:
                            str8 = fxn.g(parcel, readInt4);
                            break;
                        case 6:
                            str9 = fxn.g(parcel, readInt4);
                            break;
                        case 7:
                            str10 = fxn.g(parcel, readInt4);
                            break;
                        default:
                            fxn.u(parcel, readInt4);
                            break;
                    }
                }
                fxn.l(parcel, v3);
                return new a1o(str4, str5, str6, str7, str8, str9, str10);
            case 3:
                int v4 = fxn.v(parcel);
                while (parcel.dataPosition() < v4) {
                    int readInt5 = parcel.readInt();
                    char c3 = (char) readInt5;
                    if (c3 != 1) {
                        if (c3 != 2) {
                            fxn.u(parcel, readInt5);
                        } else {
                            str = fxn.g(parcel, readInt5);
                        }
                    } else {
                        i = fxn.q(parcel, readInt5);
                    }
                }
                fxn.l(parcel, v4);
                return new b1o(i, str);
            case 4:
                int v5 = fxn.v(parcel);
                String str11 = null;
                while (parcel.dataPosition() < v5) {
                    int readInt6 = parcel.readInt();
                    char c4 = (char) readInt6;
                    if (c4 != 1) {
                        if (c4 != 2) {
                            fxn.u(parcel, readInt6);
                        } else {
                            str11 = fxn.g(parcel, readInt6);
                        }
                    } else {
                        str = fxn.g(parcel, readInt6);
                    }
                }
                fxn.l(parcel, v5);
                return new d1o(str, str11);
            case 5:
                int v6 = fxn.v(parcel);
                String str12 = null;
                while (parcel.dataPosition() < v6) {
                    int readInt7 = parcel.readInt();
                    char c5 = (char) readInt7;
                    if (c5 != 1) {
                        if (c5 != 2) {
                            fxn.u(parcel, readInt7);
                        } else {
                            str12 = fxn.g(parcel, readInt7);
                        }
                    } else {
                        str = fxn.g(parcel, readInt7);
                    }
                }
                fxn.l(parcel, v6);
                return new f1o(str, str12);
            case 6:
                int v7 = fxn.v(parcel);
                String str13 = null;
                while (parcel.dataPosition() < v7) {
                    int readInt8 = parcel.readInt();
                    char c6 = (char) readInt8;
                    if (c6 != 1) {
                        if (c6 != 2) {
                            if (c6 != 3) {
                                fxn.u(parcel, readInt8);
                            } else {
                                i = fxn.q(parcel, readInt8);
                            }
                        } else {
                            str13 = fxn.g(parcel, readInt8);
                        }
                    } else {
                        str = fxn.g(parcel, readInt8);
                    }
                }
                fxn.l(parcel, v7);
                return new k1o(str, str13, i);
            case 7:
                int v8 = fxn.v(parcel);
                long j = 0;
                int i2 = 0;
                int i3 = 0;
                int i4 = 0;
                int i5 = 0;
                while (true) {
                    long j2 = j;
                    while (parcel.dataPosition() < v8) {
                        readInt = parcel.readInt();
                        char c7 = (char) readInt;
                        if (c7 != 1) {
                            if (c7 != 2) {
                                if (c7 != 3) {
                                    if (c7 != 4) {
                                        if (c7 != 5) {
                                            fxn.u(parcel, readInt);
                                        }
                                    } else {
                                        i5 = fxn.q(parcel, readInt);
                                    }
                                } else {
                                    i4 = fxn.q(parcel, readInt);
                                }
                            } else {
                                i3 = fxn.q(parcel, readInt);
                            }
                        } else {
                            i2 = fxn.q(parcel, readInt);
                        }
                    }
                    fxn.l(parcel, v8);
                    return new e2o(i2, i3, i4, j2, i5);
                    j = fxn.s(parcel, readInt);
                    break;
                }
            case 8:
                int v9 = fxn.v(parcel);
                re5 re5Var = null;
                while (parcel.dataPosition() < v9) {
                    int readInt9 = parcel.readInt();
                    char c8 = (char) readInt9;
                    if (c8 != 1) {
                        if (c8 != 2) {
                            fxn.u(parcel, readInt9);
                        } else {
                            re5Var = (re5) fxn.f(parcel, readInt9, re5.CREATOR);
                        }
                    } else {
                        str = fxn.g(parcel, readInt9);
                    }
                }
                fxn.l(parcel, v9);
                ?? g5Var = new g5();
                g5Var.a = str;
                g5Var.b = re5Var;
                return g5Var;
            default:
                int v10 = fxn.v(parcel);
                String str14 = null;
                String str15 = null;
                String str16 = null;
                String str17 = null;
                String str18 = null;
                String str19 = null;
                String str20 = null;
                String str21 = null;
                String str22 = null;
                String str23 = null;
                String str24 = null;
                String str25 = null;
                String str26 = null;
                while (parcel.dataPosition() < v10) {
                    int readInt10 = parcel.readInt();
                    String str27 = str26;
                    switch ((char) readInt10) {
                        case 2:
                            str = fxn.g(parcel, readInt10);
                            break;
                        case 3:
                            str15 = fxn.g(parcel, readInt10);
                            break;
                        case 4:
                            str16 = fxn.g(parcel, readInt10);
                            break;
                        case 5:
                            str17 = fxn.g(parcel, readInt10);
                            break;
                        case 6:
                            str18 = fxn.g(parcel, readInt10);
                            break;
                        case 7:
                            str19 = fxn.g(parcel, readInt10);
                            break;
                        case '\b':
                            str20 = fxn.g(parcel, readInt10);
                            break;
                        case '\t':
                            str21 = fxn.g(parcel, readInt10);
                            break;
                        case '\n':
                            str22 = fxn.g(parcel, readInt10);
                            break;
                        case 11:
                            str23 = fxn.g(parcel, readInt10);
                            break;
                        case '\f':
                            str24 = fxn.g(parcel, readInt10);
                            break;
                        case '\r':
                            str25 = fxn.g(parcel, readInt10);
                            break;
                        case 14:
                            str26 = fxn.g(parcel, readInt10);
                            continue;
                        case 15:
                            str14 = fxn.g(parcel, readInt10);
                            break;
                        default:
                            fxn.u(parcel, readInt10);
                            break;
                    }
                    str26 = str27;
                }
                fxn.l(parcel, v10);
                ?? g5Var2 = new g5();
                g5Var2.a = str;
                g5Var2.b = str15;
                g5Var2.c = str16;
                g5Var2.d = str17;
                g5Var2.e = str18;
                g5Var2.f = str19;
                g5Var2.g = str20;
                g5Var2.h = str21;
                g5Var2.i = str22;
                g5Var2.j = str23;
                g5Var2.k = str24;
                g5Var2.l = str25;
                g5Var2.m = str26;
                g5Var2.n = str14;
                return g5Var2;
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new x0o[i];
            case 1:
                return new y0o[i];
            case 2:
                return new a1o[i];
            case 3:
                return new b1o[i];
            case 4:
                return new d1o[i];
            case 5:
                return new f1o[i];
            case 6:
                return new k1o[i];
            case 7:
                return new e2o[i];
            case 8:
                return new k2e[i];
            default:
                return new e0n[i];
        }
    }
}
