package defpackage;

import com.google.mlkit.vision.barcode.common.Barcode;
import java.lang.reflect.Field;
import java.nio.charset.Charset;
import java.util.concurrent.ConcurrentHashMap;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class m1n {
    public static final m1n c = new m1n();
    public final ConcurrentHashMap b = new ConcurrentHashMap();
    public final rxm a = new rxm();

    /* JADX WARN: Removed duplicated region for block: B:115:0x03c6  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x041e  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x02d7  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x02f4  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x02f7  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x02dc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final g2n a(Class cls) {
        boolean z;
        g2n j0nVar;
        atj atjVar;
        int i;
        int charAt;
        int charAt2;
        int charAt3;
        int i2;
        int[] iArr;
        int i3;
        int i4;
        int i5;
        int i6;
        char charAt4;
        int i7;
        char charAt5;
        int i8;
        char charAt6;
        int i9;
        char charAt7;
        int i10;
        char charAt8;
        int i11;
        char charAt9;
        int i12;
        char charAt10;
        int i13;
        char charAt11;
        Object[] objArr;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int objectFieldOffset;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        Field y;
        char charAt12;
        int i26;
        int i27;
        int i28;
        int i29;
        int i30;
        int i31;
        int i32;
        Object obj;
        Field y2;
        Object obj2;
        Field y3;
        int i33;
        char charAt13;
        int i34;
        int i35;
        char charAt14;
        int i36;
        int i37;
        char charAt15;
        Object[] objArr2;
        int i38;
        char charAt16;
        Charset charset = jum.a;
        if (cls != null) {
            ConcurrentHashMap concurrentHashMap = this.b;
            g2n g2nVar = (g2n) concurrentHashMap.get(cls);
            if (g2nVar == null) {
                sij sijVar = q2n.a;
                usm.class.isAssignableFrom(cls);
                z1n c2 = this.a.a.c(cls);
                int i39 = 0;
                if ((c2.d & 2) == 2) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    int i40 = b1n.a;
                    int i41 = wwm.a;
                    sij sijVar2 = q2n.a;
                    if (c2.a() - 1 != 1) {
                        atjVar = nqm.a;
                    } else {
                        atjVar = null;
                    }
                    int i42 = pym.a;
                    int[] iArr2 = b0n.l;
                    if (c2 instanceof z1n) {
                        String str = c2.b;
                        int length = str.length();
                        if (str.charAt(0) >= 55296) {
                            int i43 = 1;
                            while (true) {
                                i = i43 + 1;
                                if (str.charAt(i43) < 55296) {
                                    break;
                                }
                                i43 = i;
                            }
                        } else {
                            i = 1;
                        }
                        int i44 = i + 1;
                        int charAt17 = str.charAt(i);
                        if (charAt17 >= 55296) {
                            int i45 = charAt17 & 8191;
                            int i46 = 13;
                            while (true) {
                                i38 = i44 + 1;
                                charAt16 = str.charAt(i44);
                                if (charAt16 < 55296) {
                                    break;
                                }
                                i45 |= (charAt16 & 8191) << i46;
                                i46 += 13;
                                i44 = i38;
                            }
                            charAt17 = i45 | (charAt16 << i46);
                            i44 = i38;
                        }
                        if (charAt17 == 0) {
                            i4 = 0;
                            charAt = 0;
                            charAt2 = 0;
                            charAt3 = 0;
                            i5 = 0;
                            iArr = b0n.l;
                            i3 = 0;
                        } else {
                            int i47 = i44 + 1;
                            int charAt18 = str.charAt(i44);
                            if (charAt18 >= 55296) {
                                int i48 = charAt18 & 8191;
                                int i49 = 13;
                                while (true) {
                                    i13 = i47 + 1;
                                    charAt11 = str.charAt(i47);
                                    if (charAt11 < 55296) {
                                        break;
                                    }
                                    i48 |= (charAt11 & 8191) << i49;
                                    i49 += 13;
                                    i47 = i13;
                                }
                                charAt18 = i48 | (charAt11 << i49);
                                i47 = i13;
                            }
                            int i50 = i47 + 1;
                            int charAt19 = str.charAt(i47);
                            if (charAt19 >= 55296) {
                                int i51 = charAt19 & 8191;
                                int i52 = 13;
                                while (true) {
                                    i12 = i50 + 1;
                                    charAt10 = str.charAt(i50);
                                    if (charAt10 < 55296) {
                                        break;
                                    }
                                    i51 |= (charAt10 & 8191) << i52;
                                    i52 += 13;
                                    i50 = i12;
                                }
                                charAt19 = i51 | (charAt10 << i52);
                                i50 = i12;
                            }
                            int i53 = i50 + 1;
                            charAt = str.charAt(i50);
                            if (charAt >= 55296) {
                                int i54 = charAt & 8191;
                                int i55 = 13;
                                while (true) {
                                    i11 = i53 + 1;
                                    charAt9 = str.charAt(i53);
                                    if (charAt9 < 55296) {
                                        break;
                                    }
                                    i54 |= (charAt9 & 8191) << i55;
                                    i55 += 13;
                                    i53 = i11;
                                }
                                charAt = i54 | (charAt9 << i55);
                                i53 = i11;
                            }
                            int i56 = i53 + 1;
                            charAt2 = str.charAt(i53);
                            if (charAt2 >= 55296) {
                                int i57 = charAt2 & 8191;
                                int i58 = 13;
                                while (true) {
                                    i10 = i56 + 1;
                                    charAt8 = str.charAt(i56);
                                    if (charAt8 < 55296) {
                                        break;
                                    }
                                    i57 |= (charAt8 & 8191) << i58;
                                    i58 += 13;
                                    i56 = i10;
                                }
                                charAt2 = i57 | (charAt8 << i58);
                                i56 = i10;
                            }
                            int i59 = i56 + 1;
                            charAt3 = str.charAt(i56);
                            if (charAt3 >= 55296) {
                                int i60 = charAt3 & 8191;
                                int i61 = 13;
                                while (true) {
                                    i9 = i59 + 1;
                                    charAt7 = str.charAt(i59);
                                    if (charAt7 < 55296) {
                                        break;
                                    }
                                    i60 |= (charAt7 & 8191) << i61;
                                    i61 += 13;
                                    i59 = i9;
                                }
                                charAt3 = i60 | (charAt7 << i61);
                                i59 = i9;
                            }
                            int i62 = i59 + 1;
                            int charAt20 = str.charAt(i59);
                            if (charAt20 >= 55296) {
                                int i63 = charAt20 & 8191;
                                int i64 = 13;
                                while (true) {
                                    i8 = i62 + 1;
                                    charAt6 = str.charAt(i62);
                                    if (charAt6 < 55296) {
                                        break;
                                    }
                                    i63 |= (charAt6 & 8191) << i64;
                                    i64 += 13;
                                    i62 = i8;
                                }
                                charAt20 = i63 | (charAt6 << i64);
                                i62 = i8;
                            }
                            int i65 = i62 + 1;
                            int charAt21 = str.charAt(i62);
                            if (charAt21 >= 55296) {
                                int i66 = charAt21 & 8191;
                                int i67 = i65;
                                int i68 = 13;
                                while (true) {
                                    i7 = i67 + 1;
                                    charAt5 = str.charAt(i67);
                                    if (charAt5 < 55296) {
                                        break;
                                    }
                                    i66 |= (charAt5 & 8191) << i68;
                                    i68 += 13;
                                    i67 = i7;
                                }
                                charAt21 = i66 | (charAt5 << i68);
                                i2 = i7;
                            } else {
                                i2 = i65;
                            }
                            int i69 = i2 + 1;
                            int charAt22 = str.charAt(i2);
                            if (charAt22 >= 55296) {
                                int i70 = charAt22 & 8191;
                                int i71 = i69;
                                int i72 = 13;
                                while (true) {
                                    i6 = i71 + 1;
                                    charAt4 = str.charAt(i71);
                                    if (charAt4 < 55296) {
                                        break;
                                    }
                                    i70 |= (charAt4 & 8191) << i72;
                                    i72 += 13;
                                    i71 = i6;
                                }
                                charAt22 = i70 | (charAt4 << i72);
                                i69 = i6;
                            }
                            int i73 = charAt22 + charAt20 + charAt21;
                            int i74 = charAt18 + charAt18 + charAt19;
                            int[] iArr3 = new int[i73];
                            int i75 = charAt20;
                            iArr = iArr3;
                            i3 = i75;
                            i4 = i74;
                            i5 = charAt22;
                            i39 = charAt18;
                            i44 = i69;
                        }
                        Unsafe unsafe = b0n.m;
                        Object[] objArr3 = c2.c;
                        int i76 = i44;
                        Class<?> cls2 = c2.a.getClass();
                        int i77 = i3 + i5;
                        int i78 = i39;
                        int i79 = charAt3 + charAt3;
                        int[] iArr4 = new int[charAt3 * 3];
                        Object[] objArr4 = new Object[i79];
                        int i80 = i4;
                        int i81 = i76;
                        int i82 = i77;
                        int i83 = i5;
                        int i84 = 0;
                        int i85 = 0;
                        while (i81 < length) {
                            int i86 = i81 + 1;
                            int charAt23 = str.charAt(i81);
                            int i87 = length;
                            if (charAt23 >= 55296) {
                                int i88 = charAt23 & 8191;
                                int i89 = i86;
                                int i90 = 13;
                                while (true) {
                                    i37 = i89 + 1;
                                    charAt15 = str.charAt(i89);
                                    objArr2 = objArr4;
                                    if (charAt15 < 55296) {
                                        break;
                                    }
                                    i88 |= (charAt15 & 8191) << i90;
                                    i90 += 13;
                                    i89 = i37;
                                    objArr4 = objArr2;
                                }
                                charAt23 = i88 | (charAt15 << i90);
                                i14 = i37;
                                objArr = objArr2;
                            } else {
                                objArr = objArr4;
                                i14 = i86;
                            }
                            int i91 = i14 + 1;
                            int charAt24 = str.charAt(i14);
                            if (charAt24 >= 55296) {
                                int i92 = charAt24 & 8191;
                                int i93 = i91;
                                int i94 = 13;
                                while (true) {
                                    i35 = i93 + 1;
                                    charAt14 = str.charAt(i93);
                                    i36 = i92;
                                    if (charAt14 < 55296) {
                                        break;
                                    }
                                    i92 = i36 | ((charAt14 & 8191) << i94);
                                    i94 += 13;
                                    i93 = i35;
                                }
                                charAt24 = i36 | (charAt14 << i94);
                                i15 = i35;
                            } else {
                                i15 = i91;
                            }
                            Object[] objArr5 = objArr3;
                            if ((charAt24 & Barcode.FORMAT_UPC_E) != 0) {
                                iArr[i85] = i84;
                                i85++;
                            }
                            int i95 = charAt24 & 255;
                            int i96 = i77;
                            int i97 = charAt24 & 2048;
                            if (i95 >= 51) {
                                int i98 = i15 + 1;
                                int charAt25 = str.charAt(i15);
                                if (charAt25 >= 55296) {
                                    int i99 = charAt25 & 8191;
                                    int i100 = i98;
                                    int i101 = 13;
                                    while (true) {
                                        i33 = i100 + 1;
                                        charAt13 = str.charAt(i100);
                                        i34 = i99;
                                        if (charAt13 < 55296) {
                                            break;
                                        }
                                        i99 = i34 | ((charAt13 & 8191) << i101);
                                        i101 += 13;
                                        i100 = i33;
                                    }
                                    charAt25 = i34 | (charAt13 << i101);
                                    i30 = i33;
                                } else {
                                    i30 = i98;
                                }
                                int i102 = charAt25;
                                int i103 = i95 - 51;
                                int i104 = i30;
                                if (i103 != 9 && i103 != 17) {
                                    if (i103 == 12) {
                                        if (c2.a() != 1 && i97 == 0) {
                                            i32 = 0;
                                            int i105 = i102 + i102;
                                            obj = objArr5[i105];
                                            i25 = i32;
                                            if (obj instanceof Field) {
                                                y2 = (Field) obj;
                                            } else {
                                                y2 = b0n.y(cls2, (String) obj);
                                                objArr5[i105] = y2;
                                            }
                                            i16 = charAt23;
                                            int objectFieldOffset2 = (int) unsafe.objectFieldOffset(y2);
                                            int i106 = i105 + 1;
                                            obj2 = objArr5[i106];
                                            if (obj2 instanceof Field) {
                                                y3 = (Field) obj2;
                                            } else {
                                                y3 = b0n.y(cls2, (String) obj2);
                                                objArr5[i106] = y3;
                                            }
                                            int objectFieldOffset3 = (int) unsafe.objectFieldOffset(y3);
                                            i17 = charAt;
                                            i18 = charAt2;
                                            i81 = i104;
                                            i23 = 0;
                                            i20 = objectFieldOffset3;
                                            i24 = objectFieldOffset2;
                                        } else {
                                            i31 = i80 + 1;
                                            int i107 = i84 / 3;
                                            objArr[i107 + i107 + 1] = objArr5[i80];
                                        }
                                    }
                                    i32 = i97;
                                    int i1052 = i102 + i102;
                                    obj = objArr5[i1052];
                                    i25 = i32;
                                    if (obj instanceof Field) {
                                    }
                                    i16 = charAt23;
                                    int objectFieldOffset22 = (int) unsafe.objectFieldOffset(y2);
                                    int i1062 = i1052 + 1;
                                    obj2 = objArr5[i1062];
                                    if (obj2 instanceof Field) {
                                    }
                                    int objectFieldOffset32 = (int) unsafe.objectFieldOffset(y3);
                                    i17 = charAt;
                                    i18 = charAt2;
                                    i81 = i104;
                                    i23 = 0;
                                    i20 = objectFieldOffset32;
                                    i24 = objectFieldOffset22;
                                } else {
                                    i31 = i80 + 1;
                                    int i108 = i84 / 3;
                                    objArr[i108 + i108 + 1] = objArr5[i80];
                                }
                                i80 = i31;
                                i32 = i97;
                                int i10522 = i102 + i102;
                                obj = objArr5[i10522];
                                i25 = i32;
                                if (obj instanceof Field) {
                                }
                                i16 = charAt23;
                                int objectFieldOffset222 = (int) unsafe.objectFieldOffset(y2);
                                int i10622 = i10522 + 1;
                                obj2 = objArr5[i10622];
                                if (obj2 instanceof Field) {
                                }
                                int objectFieldOffset322 = (int) unsafe.objectFieldOffset(y3);
                                i17 = charAt;
                                i18 = charAt2;
                                i81 = i104;
                                i23 = 0;
                                i20 = objectFieldOffset322;
                                i24 = objectFieldOffset222;
                            } else {
                                i16 = charAt23;
                                int i109 = i80 + 1;
                                Field y4 = b0n.y(cls2, (String) objArr5[i80]);
                                if (i95 == 9 || i95 == 17) {
                                    i17 = charAt;
                                    int i110 = i84 / 3;
                                    objArr[i110 + i110 + 1] = y4.getType();
                                } else {
                                    if (i95 != 27) {
                                        if (i95 == 49) {
                                            i80 += 2;
                                            i17 = charAt;
                                            i26 = 1;
                                        } else {
                                            if (i95 != 12 && i95 != 30 && i95 != 44) {
                                                if (i95 == 50) {
                                                    int i111 = i80 + 2;
                                                    int i112 = i83 + 1;
                                                    iArr[i83] = i84;
                                                    int i113 = i84 / 3;
                                                    int i114 = i113 + i113;
                                                    objArr[i114] = objArr5[i109];
                                                    if (i97 != 0) {
                                                        i80 += 3;
                                                        objArr[i114 + 1] = objArr5[i111];
                                                        i18 = charAt2;
                                                        i19 = i97;
                                                        i83 = i112;
                                                    } else {
                                                        i80 = i111;
                                                        i18 = charAt2;
                                                        i83 = i112;
                                                        i19 = 0;
                                                    }
                                                    i17 = charAt;
                                                } else {
                                                    i17 = charAt;
                                                }
                                            } else {
                                                i17 = charAt;
                                                if (c2.a() != 1 && i97 == 0) {
                                                    i18 = charAt2;
                                                    i80 = i109;
                                                    i19 = 0;
                                                } else {
                                                    i80 += 2;
                                                    int i115 = i84 / 3;
                                                    objArr[i115 + i115 + 1] = objArr5[i109];
                                                    i18 = charAt2;
                                                    i19 = i97;
                                                }
                                            }
                                            objectFieldOffset = (int) unsafe.objectFieldOffset(y4);
                                            i20 = 1048575;
                                            if ((charAt24 & 4096) == 0 && i95 <= 17) {
                                                int i116 = i15 + 1;
                                                int charAt26 = str.charAt(i15);
                                                if (charAt26 >= 55296) {
                                                    int i117 = charAt26 & 8191;
                                                    int i118 = 13;
                                                    while (true) {
                                                        i21 = i116 + 1;
                                                        charAt12 = str.charAt(i116);
                                                        if (charAt12 < 55296) {
                                                            break;
                                                        }
                                                        i117 |= (charAt12 & 8191) << i118;
                                                        i118 += 13;
                                                        i116 = i21;
                                                    }
                                                    charAt26 = i117 | (charAt12 << i118);
                                                } else {
                                                    i21 = i116;
                                                }
                                                int i119 = (charAt26 / 32) + i78 + i78;
                                                Object obj3 = objArr5[i119];
                                                if (obj3 instanceof Field) {
                                                    y = (Field) obj3;
                                                } else {
                                                    y = b0n.y(cls2, (String) obj3);
                                                    objArr5[i119] = y;
                                                }
                                                i22 = charAt26 % 32;
                                                i20 = (int) unsafe.objectFieldOffset(y);
                                            } else {
                                                i21 = i15;
                                                i22 = 0;
                                            }
                                            if (i95 < 18 && i95 <= 49) {
                                                int i120 = i82 + 1;
                                                iArr[i82] = objectFieldOffset;
                                                int i121 = i19;
                                                i23 = i22;
                                                i24 = objectFieldOffset;
                                                i81 = i21;
                                                i25 = i121;
                                                i82 = i120;
                                            } else {
                                                int i122 = i19;
                                                i23 = i22;
                                                i24 = objectFieldOffset;
                                                i81 = i21;
                                                i25 = i122;
                                            }
                                        }
                                    } else {
                                        i17 = charAt;
                                        i26 = 1;
                                        i80 += 2;
                                    }
                                    int i123 = i84 / 3;
                                    objArr[i123 + i123 + i26] = objArr5[i109];
                                    i18 = charAt2;
                                    i19 = i97;
                                    objectFieldOffset = (int) unsafe.objectFieldOffset(y4);
                                    i20 = 1048575;
                                    if ((charAt24 & 4096) == 0) {
                                    }
                                    i21 = i15;
                                    i22 = 0;
                                    if (i95 < 18) {
                                    }
                                    int i1222 = i19;
                                    i23 = i22;
                                    i24 = objectFieldOffset;
                                    i81 = i21;
                                    i25 = i1222;
                                }
                                i18 = charAt2;
                                i19 = i97;
                                i80 = i109;
                                objectFieldOffset = (int) unsafe.objectFieldOffset(y4);
                                i20 = 1048575;
                                if ((charAt24 & 4096) == 0) {
                                }
                                i21 = i15;
                                i22 = 0;
                                if (i95 < 18) {
                                }
                                int i12222 = i19;
                                i23 = i22;
                                i24 = objectFieldOffset;
                                i81 = i21;
                                i25 = i12222;
                            }
                            int i124 = i84 + 1;
                            iArr4[i84] = i16;
                            int i125 = i84 + 2;
                            String str2 = str;
                            if ((charAt24 & Barcode.FORMAT_UPC_A) != 0) {
                                i27 = 536870912;
                            } else {
                                i27 = 0;
                            }
                            if ((charAt24 & 256) != 0) {
                                i28 = 268435456;
                            } else {
                                i28 = 0;
                            }
                            if (i25 != 0) {
                                i29 = Integer.MIN_VALUE;
                            } else {
                                i29 = 0;
                            }
                            iArr4[i124] = i27 | i28 | i29 | (i95 << 20) | i24;
                            i84 += 3;
                            iArr4[i125] = (i23 << 20) | i20;
                            charAt2 = i18;
                            objArr3 = objArr5;
                            length = i87;
                            i77 = i96;
                            objArr4 = objArr;
                            charAt = i17;
                            str = str2;
                        }
                        j0nVar = new b0n(iArr4, objArr4, charAt, charAt2, c2.a, iArr, i5, i77, sijVar2, atjVar);
                    } else {
                        dmk.p();
                        return null;
                    }
                } else {
                    sij sijVar3 = q2n.a;
                    atj atjVar2 = nqm.a;
                    j0nVar = new j0n(sijVar3, c2.a);
                }
                Charset charset2 = jum.a;
                g2n g2nVar2 = (g2n) concurrentHashMap.putIfAbsent(cls, j0nVar);
                if (g2nVar2 == null) {
                    return j0nVar;
                }
                return g2nVar2;
            }
            return g2nVar;
        }
        dmk.s("messageType");
        return null;
    }
}
