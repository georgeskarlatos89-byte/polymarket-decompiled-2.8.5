package defpackage;

import androidx.lifecycle.ViewModelProvider$Factory;
import androidx.lifecycle.viewmodel.CreationExtras;
import java.util.Arrays;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class rv9 implements ViewModelProvider$Factory {
    private final fak[] a;

    public rv9(fak... fakVarArr) {
        this.a = fakVarArr;
    }

    @Override // androidx.lifecycle.ViewModelProvider$Factory
    public final dak create(Class cls, CreationExtras creationExtras) {
        fak fakVar;
        dak dakVar;
        Function1 a;
        creationExtras.getClass();
        KClass orCreateKotlinClass = lvf.a.getOrCreateKotlinClass(cls);
        fak[] fakVarArr = this.a;
        fak[] fakVarArr2 = (fak[]) Arrays.copyOf(fakVarArr, fakVarArr.length);
        orCreateKotlinClass.getClass();
        int length = fakVarArr2.length;
        int i = 0;
        while (true) {
            if (i < length) {
                fakVar = fakVarArr2[i];
                if (Intrinsics.areEqual(fakVar.a, orCreateKotlinClass)) {
                    break;
                }
                i++;
            } else {
                fakVar = null;
                break;
            }
        }
        if (fakVar != null && (a = fakVar.a()) != null) {
            dakVar = (dak) a.invoke(creationExtras);
        } else {
            dakVar = null;
        }
        if (dakVar != null) {
            return dakVar;
        }
        xbc.p(orCreateKotlinClass.getQualifiedName(), "No initializer set for given class ");
        return null;
    }
}
