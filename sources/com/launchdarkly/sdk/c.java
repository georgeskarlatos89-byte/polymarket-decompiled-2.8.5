package com.launchdarkly.sdk;

import com.socure.docv.capturesdk.api.Keys;
import defpackage.fva;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class c {
    public d a;
    public String b;
    public String c;
    public b d;
    public boolean e;
    public List f;
    public boolean g;
    public boolean h;
    public boolean i;

    public final LDContext a() {
        boolean z;
        String str;
        b bVar = this.d;
        int i = 0;
        boolean z2 = true;
        if (bVar != null) {
            z = true;
        } else {
            z = false;
        }
        this.g = z;
        List list = this.f;
        if (list == null) {
            z2 = false;
        }
        this.h = z2;
        d dVar = this.a;
        String str2 = this.b;
        String str3 = this.c;
        boolean z3 = this.e;
        boolean z4 = this.i;
        d dVar2 = d.b;
        if (dVar != null) {
            String str4 = dVar.a;
            String str5 = null;
            if (dVar != dVar2) {
                if (dVar == d.c) {
                    str5 = "context of kind \"multi\" must be created with NewMulti or NewMultiBuilder";
                } else if (str4.equals("kind")) {
                    str5 = "\"kind\" is not a valid context kind";
                } else {
                    while (true) {
                        if (i >= str4.length()) {
                            break;
                        }
                        char charAt = str4.charAt(i);
                        if ((charAt < 'a' || charAt > 'z') && ((charAt < 'A' || charAt > 'Z') && ((charAt < '0' || charAt > '9') && charAt != '.' && charAt != '_' && charAt != '-'))) {
                            str5 = "context kind contains disallowed characters";
                            break;
                        }
                        i++;
                    }
                }
            }
            if (str5 != null) {
                return new LDContext(str5);
            }
        }
        if (str2 != null && (!str2.isEmpty() || z4)) {
            dVar.getClass();
            if (dVar == dVar2) {
                str = str2;
            } else {
                str = dVar.a + ":" + str2.replace("%", "%25").replace(":", "%3A");
            }
            return new LDContext(dVar, null, str2, str, str3, bVar, z3, list);
        }
        return new LDContext("context key must not be null or empty");
    }

    public final void b(AttributeRef... attributeRefArr) {
        if (attributeRefArr.length != 0) {
            if (this.h) {
                this.f = new ArrayList(this.f);
                this.h = false;
            } else if (this.f == null) {
                this.f = new ArrayList();
            }
            for (AttributeRef attributeRef : attributeRefArr) {
                this.f.add(attributeRef);
            }
        }
    }

    public final void c(String str, LDValue lDValue) {
        if (str != null && !str.isEmpty()) {
            char c = 65535;
            switch (str.hashCode()) {
                case -2095811475:
                    if (str.equals("anonymous")) {
                        c = 0;
                        break;
                    }
                    break;
                case 106079:
                    if (str.equals("key")) {
                        c = 1;
                        break;
                    }
                    break;
                case 3292052:
                    if (str.equals("kind")) {
                        c = 2;
                        break;
                    }
                    break;
                case 3373707:
                    if (str.equals(Keys.KEY_NAME)) {
                        c = 3;
                        break;
                    }
                    break;
                case 91082468:
                    if (str.equals("_meta")) {
                        c = 4;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    if (lDValue.e() == fva.BOOLEAN) {
                        this.e = lDValue.a();
                        return;
                    }
                    return;
                case 1:
                    lDValue.getClass();
                    if (lDValue instanceof LDValueString) {
                        this.b = lDValue.p();
                        return;
                    }
                    return;
                case 2:
                    lDValue.getClass();
                    if (lDValue instanceof LDValueString) {
                        this.a = d.a(lDValue.p());
                        return;
                    }
                    return;
                case 3:
                    lDValue.getClass();
                    if ((lDValue instanceof LDValueString) || (lDValue instanceof LDValueNull)) {
                        this.c = lDValue.p();
                        return;
                    }
                    return;
                case 4:
                    return;
                default:
                    if (this.g) {
                        this.d = new b(this.d);
                        this.g = false;
                    }
                    if (lDValue != null && !(lDValue instanceof LDValueNull)) {
                        b bVar = this.d;
                        if (bVar == null) {
                            bVar = new b(null);
                            this.d = bVar;
                        }
                        bVar.b.put(str, lDValue);
                        return;
                    }
                    b bVar2 = this.d;
                    if (bVar2 != null) {
                        b bVar3 = bVar2.a;
                        HashMap hashMap = bVar2.b;
                        if (bVar3 == null) {
                            hashMap.remove(str);
                            return;
                        } else {
                            hashMap.put(str, LDValueNull.INSTANCE);
                            return;
                        }
                    }
                    return;
            }
        }
    }
}
