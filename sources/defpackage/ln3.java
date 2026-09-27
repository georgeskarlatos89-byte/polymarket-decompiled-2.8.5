package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final class ln3 {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ ln3[] $VALUES;
    public static final ln3 Activities;
    public static final ln3 AnimalsAndNature;
    public static final ln3 Flags;
    public static final ln3 FoodAndDrink;
    public static final ln3 Objects;
    public static final ln3 PeopleAndBody;
    public static final ln3 SmileysAndEmotion;
    public static final ln3 Symbols;
    public static final ln3 TravelAndPlaces;
    private final String displayName;
    private final eq9 icon;
    private final String jsonCategoryName;

    static {
        float f;
        float f2;
        float f3;
        int i;
        ln3 ln3Var;
        eq9 eq9Var = huk.a;
        if (eq9Var != null) {
            f3 = 12.0f;
            f2 = 11.99f;
            f = 10.0f;
        } else {
            dq9 dq9Var = new dq9("Filled.SentimentSatisfied", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
            List list = z4k.a;
            long j = ib4.b;
            zdh zdhVar = new zdh(j);
            ArrayList arrayList = new ArrayList(32);
            arrayList.add(new wxd(15.5f, 9.5f));
            arrayList.add(new eyd(-1.5f, 0.0f));
            arrayList.add(new ayd(1.5f, 1.5f, 0.0f, true, true, 3.0f, 0.0f));
            arrayList.add(new ayd(1.5f, 1.5f, 0.0f, true, true, -3.0f, 0.0f));
            dq9.d(dq9Var, arrayList, 0, zdhVar);
            zdh zdhVar2 = new zdh(j);
            ArrayList arrayList2 = new ArrayList(32);
            arrayList2.add(new wxd(8.5f, 9.5f));
            arrayList2.add(new eyd(-1.5f, 0.0f));
            arrayList2.add(new ayd(1.5f, 1.5f, 0.0f, true, true, 3.0f, 0.0f));
            arrayList2.add(new ayd(1.5f, 1.5f, 0.0f, true, true, -3.0f, 0.0f));
            dq9.d(dq9Var, arrayList2, 0, zdhVar2);
            zdh zdhVar3 = new zdh(j);
            oq1 oq1Var = new oq1(2);
            oq1Var.i(11.99f, 2.0f);
            oq1Var.b(6.47f, 2.0f, 2.0f, 6.48f, 2.0f, 12.0f);
            f = 10.0f;
            oq1Var.k(4.47f, 10.0f, 9.99f, 10.0f);
            oq1Var.b(17.52f, 22.0f, 22.0f, 17.52f, 22.0f, 12.0f);
            f2 = 11.99f;
            oq1Var.j(17.52f, 2.0f, 11.99f, 2.0f);
            oq1Var.a();
            oq1Var.i(12.0f, 20.0f);
            oq1Var.c(-4.42f, 0.0f, -8.0f, -3.58f, -8.0f, -8.0f);
            oq1Var.k(3.58f, -8.0f, 8.0f, -8.0f);
            oq1Var.k(8.0f, 3.58f, 8.0f, 8.0f);
            oq1Var.k(-3.58f, 8.0f, -8.0f, 8.0f);
            oq1Var.a();
            f3 = 12.0f;
            oq1Var.i(12.0f, 16.0f);
            oq1Var.c(-0.73f, 0.0f, -1.38f, -0.18f, -1.96f, -0.52f);
            oq1Var.c(-0.12f, 0.14f, -0.86f, 0.98f, -1.01f, 1.15f);
            oq1Var.c(0.86f, 0.55f, 1.87f, 0.87f, 2.97f, 0.87f);
            oq1Var.c(1.11f, 0.0f, 2.12f, -0.33f, 2.98f, -0.88f);
            oq1Var.c(-0.97f, -1.09f, -0.01f, -0.02f, -1.01f, -1.15f);
            oq1Var.c(-0.59f, 0.35f, -1.24f, 0.53f, -1.97f, 0.53f);
            oq1Var.a();
            dq9.d(dq9Var, oq1Var.a, 0, zdhVar3);
            eq9Var = dq9Var.e();
            huk.a = eq9Var;
        }
        float f4 = f3;
        float f5 = f2;
        ln3 ln3Var2 = new ln3("SmileysAndEmotion", 0, "Smileys & Emotion", "Smileys & Emotion", eq9Var);
        SmileysAndEmotion = ln3Var2;
        eq9 eq9Var2 = svl.g;
        if (eq9Var2 == null) {
            dq9 dq9Var2 = new dq9("Filled.TagFaces", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
            List list2 = z4k.a;
            zdh zdhVar4 = new zdh(ib4.b);
            oq1 oq1Var2 = new oq1(2);
            oq1Var2.i(f5, 2.0f);
            oq1Var2.b(6.47f, 2.0f, 2.0f, 6.48f, 2.0f, 12.0f);
            oq1Var2.k(4.47f, f, 9.99f, f);
            oq1Var2.b(17.52f, 22.0f, 22.0f, 17.52f, 22.0f, 12.0f);
            oq1Var2.j(17.52f, 2.0f, f5, 2.0f);
            oq1Var2.a();
            oq1Var2.i(f4, 20.0f);
            oq1Var2.c(-4.42f, 0.0f, -8.0f, -3.58f, -8.0f, -8.0f);
            oq1Var2.k(3.58f, -8.0f, 8.0f, -8.0f);
            oq1Var2.k(8.0f, 3.58f, 8.0f, 8.0f);
            oq1Var2.k(-3.58f, 8.0f, -8.0f, 8.0f);
            oq1Var2.a();
            oq1Var2.i(15.5f, 11.0f);
            oq1Var2.c(0.83f, 0.0f, 1.5f, -0.67f, 1.5f, -1.5f);
            oq1Var2.j(16.33f, 8.0f, 15.5f, 8.0f);
            oq1Var2.j(14.0f, 8.67f, 14.0f, 9.5f);
            oq1Var2.k(0.67f, 1.5f, 1.5f, 1.5f);
            oq1Var2.a();
            oq1Var2.i(8.5f, 11.0f);
            oq1Var2.c(0.83f, 0.0f, 1.5f, -0.67f, 1.5f, -1.5f);
            oq1Var2.j(9.33f, 8.0f, 8.5f, 8.0f);
            oq1Var2.j(7.0f, 8.67f, 7.0f, 9.5f);
            oq1Var2.j(7.67f, 11.0f, 8.5f, 11.0f);
            oq1Var2.a();
            oq1Var2.i(f4, 17.5f);
            oq1Var2.c(2.33f, 0.0f, 4.31f, -1.46f, 5.11f, -3.5f);
            oq1Var2.g(6.89f, 14.0f);
            oq1Var2.c(0.8f, 2.04f, 2.78f, 3.5f, 5.11f, 3.5f);
            oq1Var2.a();
            dq9.d(dq9Var2, oq1Var2.a, 0, zdhVar4);
            eq9Var2 = dq9Var2.e();
            svl.g = eq9Var2;
        }
        ln3 ln3Var3 = new ln3("PeopleAndBody", 1, "People & Body", "People & Body", eq9Var2);
        PeopleAndBody = ln3Var3;
        eq9 eq9Var3 = mon.a;
        if (eq9Var3 != null) {
            i = 32;
        } else {
            dq9 dq9Var3 = new dq9("Filled.Pets", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
            List list3 = z4k.a;
            long j2 = ib4.b;
            zdh zdhVar5 = new zdh(j2);
            i = 32;
            ArrayList arrayList3 = new ArrayList(32);
            arrayList3.add(new wxd(4.5f, 9.5f));
            arrayList3.add(new eyd(-2.5f, 0.0f));
            arrayList3.add(new ayd(2.5f, 2.5f, 0.0f, true, true, 5.0f, 0.0f));
            arrayList3.add(new ayd(2.5f, 2.5f, 0.0f, true, true, -5.0f, 0.0f));
            dq9.d(dq9Var3, arrayList3, 0, zdhVar5);
            zdh zdhVar6 = new zdh(j2);
            ArrayList arrayList4 = new ArrayList(32);
            arrayList4.add(new wxd(9.0f, 5.5f));
            arrayList4.add(new eyd(-2.5f, 0.0f));
            arrayList4.add(new ayd(2.5f, 2.5f, 0.0f, true, true, 5.0f, 0.0f));
            arrayList4.add(new ayd(2.5f, 2.5f, 0.0f, true, true, -5.0f, 0.0f));
            dq9.d(dq9Var3, arrayList4, 0, zdhVar6);
            zdh zdhVar7 = new zdh(j2);
            ArrayList arrayList5 = new ArrayList(32);
            arrayList5.add(new wxd(15.0f, 5.5f));
            arrayList5.add(new eyd(-2.5f, 0.0f));
            arrayList5.add(new ayd(2.5f, 2.5f, 0.0f, true, true, 5.0f, 0.0f));
            arrayList5.add(new ayd(2.5f, 2.5f, 0.0f, true, true, -5.0f, 0.0f));
            dq9.d(dq9Var3, arrayList5, 0, zdhVar7);
            zdh zdhVar8 = new zdh(j2);
            ArrayList arrayList6 = new ArrayList(32);
            arrayList6.add(new wxd(19.5f, 9.5f));
            arrayList6.add(new eyd(-2.5f, 0.0f));
            arrayList6.add(new ayd(2.5f, 2.5f, 0.0f, true, true, 5.0f, 0.0f));
            arrayList6.add(new ayd(2.5f, 2.5f, 0.0f, true, true, -5.0f, 0.0f));
            dq9.d(dq9Var3, arrayList6, 0, zdhVar8);
            zdh zdhVar9 = new zdh(j2);
            oq1 oq1Var3 = new oq1(2);
            oq1Var3.i(17.34f, 14.86f);
            oq1Var3.c(-0.87f, -1.02f, -1.6f, -1.89f, -2.48f, -2.91f);
            oq1Var3.c(-0.46f, -0.54f, -1.05f, -1.08f, -1.75f, -1.32f);
            oq1Var3.c(-0.11f, -0.04f, -0.22f, -0.07f, -0.33f, -0.09f);
            oq1Var3.c(-0.25f, -0.04f, -0.52f, -0.04f, -0.78f, -0.04f);
            oq1Var3.k(-0.53f, 0.0f, -0.79f, 0.05f);
            oq1Var3.c(-0.11f, 0.02f, -0.22f, 0.05f, -0.33f, 0.09f);
            oq1Var3.c(-0.7f, 0.24f, -1.28f, 0.78f, -1.75f, 1.32f);
            oq1Var3.c(-0.87f, 1.02f, -1.6f, 1.89f, -2.48f, 2.91f);
            oq1Var3.c(-1.31f, 1.31f, -2.92f, 2.76f, -2.62f, 4.79f);
            oq1Var3.c(0.29f, 1.02f, 1.02f, 2.03f, 2.33f, 2.32f);
            oq1Var3.c(0.73f, 0.15f, 3.06f, -0.44f, 5.54f, -0.44f);
            oq1Var3.f(0.18f);
            oq1Var3.c(2.48f, 0.0f, 4.81f, 0.58f, 5.54f, 0.44f);
            oq1Var3.c(1.31f, -0.29f, 2.04f, -1.31f, 2.33f, -2.32f);
            oq1Var3.c(0.31f, -2.04f, -1.3f, -3.49f, -2.61f, -4.8f);
            oq1Var3.a();
            dq9.d(dq9Var3, oq1Var3.a, 0, zdhVar9);
            eq9Var3 = dq9Var3.e();
            mon.a = eq9Var3;
        }
        ln3 ln3Var4 = new ln3("AnimalsAndNature", 2, "Animals & Nature", "Animals & Nature", eq9Var3);
        AnimalsAndNature = ln3Var4;
        eq9 eq9Var4 = jvn.a;
        if (eq9Var4 == null) {
            dq9 dq9Var4 = new dq9("Filled.Restaurant", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
            List list4 = z4k.a;
            zdh zdhVar10 = new zdh(ib4.b);
            oq1 oq1Var4 = new oq1(2);
            oq1Var4.i(11.0f, 9.0f);
            oq1Var4.g(9.0f, 9.0f);
            oq1Var4.g(9.0f, 2.0f);
            oq1Var4.g(7.0f, 2.0f);
            oq1Var4.m(7.0f);
            oq1Var4.g(5.0f, 9.0f);
            oq1Var4.g(5.0f, 2.0f);
            oq1Var4.g(3.0f, 2.0f);
            oq1Var4.m(7.0f);
            oq1Var4.c(0.0f, 2.12f, 1.66f, 3.84f, 3.75f, 3.97f);
            oq1Var4.g(6.75f, 22.0f);
            oq1Var4.f(2.5f);
            oq1Var4.m(-9.03f);
            oq1Var4.b(11.34f, 12.84f, 13.0f, 11.12f, 13.0f, 9.0f);
            oq1Var4.g(13.0f, 2.0f);
            oq1Var4.f(-2.0f);
            oq1Var4.m(7.0f);
            oq1Var4.a();
            oq1Var4.i(16.0f, 6.0f);
            oq1Var4.m(8.0f);
            oq1Var4.f(2.5f);
            oq1Var4.m(8.0f);
            oq1Var4.g(21.0f, 22.0f);
            oq1Var4.g(21.0f, 2.0f);
            oq1Var4.c(-2.76f, 0.0f, -5.0f, 2.24f, -5.0f, 4.0f);
            oq1Var4.a();
            dq9.d(dq9Var4, oq1Var4.a, 0, zdhVar10);
            eq9Var4 = dq9Var4.e();
            jvn.a = eq9Var4;
        }
        ln3 ln3Var5 = new ln3("FoodAndDrink", 3, "Food & Drink", "Food & Drink", eq9Var4);
        FoodAndDrink = ln3Var5;
        eq9 eq9Var5 = dxn.a;
        if (eq9Var5 != null) {
            ln3Var = ln3Var5;
        } else {
            dq9 dq9Var5 = new dq9("Filled.DirectionsCar", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
            List list5 = z4k.a;
            ln3Var = ln3Var5;
            zdh zdhVar11 = new zdh(ib4.b);
            oq1 oq1Var5 = new oq1(2);
            oq1Var5.i(18.92f, 6.01f);
            oq1Var5.b(18.72f, 5.42f, 18.16f, 5.0f, 17.5f, 5.0f);
            oq1Var5.f(-11.0f);
            oq1Var5.c(-0.66f, 0.0f, -1.21f, 0.42f, -1.42f, 1.01f);
            oq1Var5.g(3.0f, 12.0f);
            oq1Var5.m(8.0f);
            oq1Var5.c(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
            oq1Var5.f(1.0f);
            oq1Var5.c(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
            oq1Var5.m(-1.0f);
            oq1Var5.f(12.0f);
            oq1Var5.m(1.0f);
            oq1Var5.c(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
            oq1Var5.f(1.0f);
            oq1Var5.c(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
            oq1Var5.m(-8.0f);
            oq1Var5.h(-2.08f, -5.99f);
            oq1Var5.a();
            oq1Var5.i(6.5f, 16.0f);
            oq1Var5.c(-0.83f, 0.0f, -1.5f, -0.67f, -1.5f, -1.5f);
            oq1Var5.j(5.67f, 13.0f, 6.5f, 13.0f);
            oq1Var5.k(1.5f, 0.67f, 1.5f, 1.5f);
            oq1Var5.j(7.33f, 16.0f, 6.5f, 16.0f);
            oq1Var5.a();
            oq1Var5.i(17.5f, 16.0f);
            oq1Var5.c(-0.83f, 0.0f, -1.5f, -0.67f, -1.5f, -1.5f);
            oq1Var5.k(0.67f, -1.5f, 1.5f, -1.5f);
            oq1Var5.k(1.5f, 0.67f, 1.5f, 1.5f);
            oq1Var5.k(-0.67f, 1.5f, -1.5f, 1.5f);
            oq1Var5.a();
            oq1Var5.i(5.0f, 11.0f);
            oq1Var5.h(1.5f, -4.5f);
            oq1Var5.f(11.0f);
            oq1Var5.g(19.0f, 11.0f);
            oq1Var5.g(5.0f, 11.0f);
            oq1Var5.a();
            dq9.d(dq9Var5, oq1Var5.a, 0, zdhVar11);
            eq9Var5 = dq9Var5.e();
            dxn.a = eq9Var5;
        }
        ln3 ln3Var6 = new ln3("TravelAndPlaces", 4, "Travel & Places", "Travel & Places", eq9Var5);
        TravelAndPlaces = ln3Var6;
        eq9 eq9Var6 = pol.b;
        if (eq9Var6 == null) {
            dq9 dq9Var6 = new dq9("Filled.SportsFootball", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
            List list6 = z4k.a;
            long j3 = ib4.b;
            zdh zdhVar12 = new zdh(j3);
            ArrayList arrayList7 = new ArrayList(i);
            arrayList7.add(new wxd(3.02f, 15.62f));
            arrayList7.add(new byd(-0.08f, 2.42f, 0.32f, 4.34f, 0.67f, 4.69f));
            arrayList7.add(new gyd(2.28f, 0.76f, 4.69f, 0.67f));
            arrayList7.add(new vxd(3.02f, 15.62f));
            sxd sxdVar = sxd.c;
            arrayList7.add(sxdVar);
            dq9.d(dq9Var6, arrayList7, 0, zdhVar12);
            zdh zdhVar13 = new zdh(j3);
            oq1 oq1Var6 = new oq1(2);
            oq1Var6.i(13.08f, 3.28f);
            oq1Var6.b(10.75f, 3.7f, 8.29f, 4.62f, 6.46f, 6.46f);
            oq1Var6.k(-2.76f, 4.29f, -3.18f, 6.62f);
            oq1Var6.h(7.63f, 7.63f);
            oq1Var6.c(2.34f, -0.41f, 4.79f, -1.34f, 6.62f, -3.18f);
            oq1Var6.k(2.76f, -4.29f, 3.18f, -6.62f);
            oq1Var6.g(13.08f, 3.28f);
            oq1Var6.a();
            oq1Var6.i(9.9f, 15.5f);
            oq1Var6.h(-1.4f, -1.4f);
            oq1Var6.h(5.6f, -5.6f);
            oq1Var6.h(1.4f, 1.4f);
            oq1Var6.g(9.9f, 15.5f);
            oq1Var6.a();
            dq9.d(dq9Var6, oq1Var6.a, 0, zdhVar13);
            zdh zdhVar14 = new zdh(j3);
            ArrayList arrayList8 = new ArrayList(32);
            arrayList8.add(new wxd(20.98f, 8.38f));
            arrayList8.add(new byd(0.08f, -2.42f, -0.32f, -4.34f, -0.67f, -4.69f));
            arrayList8.add(new gyd(-2.28f, -0.76f, -4.69f, -0.67f));
            arrayList8.add(new vxd(20.98f, 8.38f));
            arrayList8.add(sxdVar);
            dq9.d(dq9Var6, arrayList8, 0, zdhVar14);
            eq9Var6 = dq9Var6.e();
            pol.b = eq9Var6;
        }
        ln3 ln3Var7 = new ln3("Activities", 5, "Activities", "Activities", eq9Var6);
        Activities = ln3Var7;
        eq9 eq9Var7 = h6n.a;
        if (eq9Var7 == null) {
            dq9 dq9Var7 = new dq9("Filled.Lightbulb", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
            List list7 = z4k.a;
            zdh zdhVar15 = new zdh(ib4.b);
            oq1 oq1Var7 = new oq1(2);
            oq1Var7.i(9.0f, 21.0f);
            oq1Var7.c(0.0f, 0.5f, 0.4f, 1.0f, 1.0f, 1.0f);
            oq1Var7.f(4.0f);
            oq1Var7.c(0.6f, 0.0f, 1.0f, -0.5f, 1.0f, -1.0f);
            oq1Var7.m(-1.0f);
            oq1Var7.g(9.0f, 20.0f);
            oq1Var7.m(1.0f);
            oq1Var7.a();
            oq1Var7.i(12.0f, 2.0f);
            oq1Var7.b(8.1f, 2.0f, 5.0f, 5.1f, 5.0f, 9.0f);
            oq1Var7.c(0.0f, 2.4f, 1.2f, 4.5f, 3.0f, 5.7f);
            oq1Var7.g(8.0f, 17.0f);
            oq1Var7.c(0.0f, 0.5f, 0.4f, 1.0f, 1.0f, 1.0f);
            oq1Var7.f(6.0f);
            oq1Var7.c(0.6f, 0.0f, 1.0f, -0.5f, 1.0f, -1.0f);
            oq1Var7.m(-2.3f);
            oq1Var7.c(1.8f, -1.3f, 3.0f, -3.4f, 3.0f, -5.7f);
            oq1Var7.c(0.0f, -3.9f, -3.1f, -7.0f, -7.0f, -7.0f);
            oq1Var7.a();
            dq9.d(dq9Var7, oq1Var7.a, 0, zdhVar15);
            eq9Var7 = dq9Var7.e();
            h6n.a = eq9Var7;
        }
        ln3 ln3Var8 = new ln3("Objects", 6, "Objects", "Objects", eq9Var7);
        Objects = ln3Var8;
        eq9 eq9Var8 = igl.b;
        if (eq9Var8 == null) {
            dq9 dq9Var8 = new dq9("Outlined.Favorite", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
            List list8 = z4k.a;
            zdh zdhVar16 = new zdh(ib4.b);
            oq1 oq1Var8 = new oq1(2);
            oq1Var8.i(12.0f, 21.35f);
            oq1Var8.h(-1.45f, -1.32f);
            oq1Var8.b(5.4f, 15.36f, 2.0f, 12.28f, 2.0f, 8.5f);
            oq1Var8.b(2.0f, 5.42f, 4.42f, 3.0f, 7.5f, 3.0f);
            oq1Var8.c(1.74f, 0.0f, 3.41f, 0.81f, 4.5f, 2.09f);
            oq1Var8.b(13.09f, 3.81f, 14.76f, 3.0f, 16.5f, 3.0f);
            oq1Var8.b(19.58f, 3.0f, 22.0f, 5.42f, 22.0f, 8.5f);
            oq1Var8.c(0.0f, 3.78f, -3.4f, 6.86f, -8.55f, 11.54f);
            oq1Var8.g(12.0f, 21.35f);
            oq1Var8.a();
            dq9.d(dq9Var8, oq1Var8.a, 0, zdhVar16);
            eq9Var8 = dq9Var8.e();
            igl.b = eq9Var8;
        }
        ln3 ln3Var9 = new ln3("Symbols", 7, "Symbols", "Symbols", eq9Var8);
        Symbols = ln3Var9;
        eq9 eq9Var9 = djl.e;
        if (eq9Var9 == null) {
            dq9 dq9Var9 = new dq9("Filled.Flag", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
            List list9 = z4k.a;
            zdh zdhVar17 = new zdh(ib4.b);
            oq1 oq1Var9 = new oq1(2);
            oq1Var9.i(14.4f, 6.0f);
            oq1Var9.g(14.0f, 4.0f);
            oq1Var9.e(5.0f);
            oq1Var9.m(17.0f);
            oq1Var9.f(2.0f);
            oq1Var9.m(-7.0f);
            oq1Var9.f(5.6f);
            oq1Var9.h(0.4f, 2.0f);
            oq1Var9.f(7.0f);
            oq1Var9.l(6.0f);
            oq1Var9.a();
            dq9.d(dq9Var9, oq1Var9.a, 0, zdhVar17);
            eq9Var9 = dq9Var9.e();
            djl.e = eq9Var9;
        }
        ln3 ln3Var10 = new ln3("Flags", 8, "Flags", "Flags", eq9Var9);
        Flags = ln3Var10;
        ln3[] ln3VarArr = {ln3Var2, ln3Var3, ln3Var4, ln3Var, ln3Var6, ln3Var7, ln3Var8, ln3Var9, ln3Var10};
        $VALUES = ln3VarArr;
        $ENTRIES = new wg7(ln3VarArr);
    }

    public ln3(String str, int i, String str2, String str3, eq9 eq9Var) {
        this.displayName = str2;
        this.jsonCategoryName = str3;
        this.icon = eq9Var;
    }

    public static ug7 b() {
        return $ENTRIES;
    }

    public static ln3 valueOf(String str) {
        return (ln3) Enum.valueOf(ln3.class, str);
    }

    public static ln3[] values() {
        return (ln3[]) $VALUES.clone();
    }

    public final String a() {
        return this.displayName;
    }

    public final eq9 c() {
        return this.icon;
    }

    public final String d() {
        return this.jsonCategoryName;
    }
}
