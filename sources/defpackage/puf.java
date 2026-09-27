package defpackage;

import java.lang.reflect.Constructor;
import java.lang.reflect.Member;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class puf extends uuf implements zba {
    public final Constructor a;

    public puf(Constructor constructor) {
        this.a = constructor;
    }

    @Override // defpackage.uuf
    public final Member b() {
        return this.a;
    }

    @Override // defpackage.zba
    public final ArrayList getTypeParameters() {
        TypeVariable[] typeParameters = this.a.getTypeParameters();
        typeParameters.getClass();
        ArrayList arrayList = new ArrayList(typeParameters.length);
        for (TypeVariable typeVariable : typeParameters) {
            arrayList.add(new avf(typeVariable));
        }
        return arrayList;
    }
}
