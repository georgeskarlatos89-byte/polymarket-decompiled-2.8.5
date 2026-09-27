package defpackage;

import java.util.List;
import kotlin.collections.CollectionsKt;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public abstract class idd {
    public static final List a;
    public static final List b;

    static {
        hdd hddVar = hdd.One;
        hdd hddVar2 = hdd.Two;
        hdd hddVar3 = hdd.Three;
        jdd jddVar = new jdd(CollectionsKt.listOf(hddVar, hddVar2, hddVar3));
        hdd hddVar4 = hdd.Four;
        hdd hddVar5 = hdd.Five;
        hdd hddVar6 = hdd.Six;
        jdd jddVar2 = new jdd(CollectionsKt.listOf(hddVar4, hddVar5, hddVar6));
        hdd hddVar7 = hdd.Seven;
        hdd hddVar8 = hdd.Eight;
        hdd hddVar9 = hdd.Nine;
        jdd jddVar3 = new jdd(CollectionsKt.listOf(hddVar7, hddVar8, hddVar9));
        hdd hddVar10 = hdd.Dot;
        hdd hddVar11 = hdd.Zero;
        hdd hddVar12 = hdd.Backspace;
        a = CollectionsKt.listOf(jddVar, jddVar2, jddVar3, new jdd(CollectionsKt.listOf(hddVar10, hddVar11, hddVar12)));
        b = CollectionsKt.listOf(new jdd(CollectionsKt.listOf(hddVar, hddVar2, hddVar3)), new jdd(CollectionsKt.listOf(hddVar4, hddVar5, hddVar6)), new jdd(CollectionsKt.listOf(hddVar7, hddVar8, hddVar9)), new jdd(CollectionsKt.listOf(hdd.Empty, hddVar11, hddVar12)));
    }
}
