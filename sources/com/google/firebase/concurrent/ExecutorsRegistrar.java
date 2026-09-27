package com.google.firebase.concurrent;

import com.google.firebase.components.ComponentRegistrar;
import defpackage.a8b;
import defpackage.b31;
import defpackage.bk4;
import defpackage.ck4;
import defpackage.drn;
import defpackage.dya;
import defpackage.f05;
import defpackage.hl4;
import defpackage.lg1;
import defpackage.otj;
import defpackage.qp7;
import defpackage.xif;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public class ExecutorsRegistrar implements ComponentRegistrar {
    public static final dya a = new dya(new hl4(1));
    public static final dya b = new dya(new hl4(2));
    public static final dya c = new dya(new hl4(3));
    public static final dya d = new dya(new hl4(4));

    @Override // com.google.firebase.components.ComponentRegistrar
    public final List getComponents() {
        xif xifVar = new xif(b31.class, ScheduledExecutorService.class);
        xif[] xifVarArr = {new xif(b31.class, ExecutorService.class), new xif(b31.class, Executor.class)};
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        hashSet.add(xifVar);
        for (int i = 0; i < 2; i++) {
            drn.a(xifVarArr[i], "Null interface");
        }
        Collections.addAll(hashSet, xifVarArr);
        ck4 ck4Var = new ck4(null, new HashSet(hashSet), new HashSet(hashSet2), 0, 0, new f05(27), hashSet3);
        xif xifVar2 = new xif(lg1.class, ScheduledExecutorService.class);
        xif[] xifVarArr2 = {new xif(lg1.class, ExecutorService.class), new xif(lg1.class, Executor.class)};
        HashSet hashSet4 = new HashSet();
        HashSet hashSet5 = new HashSet();
        HashSet hashSet6 = new HashSet();
        hashSet4.add(xifVar2);
        for (int i2 = 0; i2 < 2; i2++) {
            drn.a(xifVarArr2[i2], "Null interface");
        }
        Collections.addAll(hashSet4, xifVarArr2);
        ck4 ck4Var2 = new ck4(null, new HashSet(hashSet4), new HashSet(hashSet5), 0, 0, new f05(28), hashSet6);
        xif xifVar3 = new xif(a8b.class, ScheduledExecutorService.class);
        xif[] xifVarArr3 = {new xif(a8b.class, ExecutorService.class), new xif(a8b.class, Executor.class)};
        HashSet hashSet7 = new HashSet();
        HashSet hashSet8 = new HashSet();
        HashSet hashSet9 = new HashSet();
        hashSet7.add(xifVar3);
        for (int i3 = 0; i3 < 2; i3++) {
            drn.a(xifVarArr3[i3], "Null interface");
        }
        Collections.addAll(hashSet7, xifVarArr3);
        ck4 ck4Var3 = new ck4(null, new HashSet(hashSet7), new HashSet(hashSet8), 0, 0, new f05(29), hashSet9);
        bk4 a2 = ck4.a(new xif(otj.class, Executor.class));
        a2.f = new qp7(0);
        return Arrays.asList(ck4Var, ck4Var2, ck4Var3, a2.b());
    }
}
