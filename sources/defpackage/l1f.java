package defpackage;

import java.util.LinkedHashMap;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public abstract class l1f {
    public static final aca a = new aca(ycd.NULLABLE, false);
    public static final aca b;
    public static final aca c;
    public static final LinkedHashMap d;

    static {
        ycd ycdVar = ycd.NOT_NULL;
        b = new aca(ycdVar, false);
        c = new aca(ycdVar, true);
        String concat = "java/lang/".concat("Object");
        String concat2 = "java/util/function/".concat("Predicate");
        String concat3 = "java/util/function/".concat("Function");
        String concat4 = "java/util/function/".concat("Consumer");
        String concat5 = "java/util/function/".concat("BiFunction");
        String concat6 = "java/util/function/".concat("BiConsumer");
        String concat7 = "java/util/function/".concat("UnaryOperator");
        String concat8 = "java/util/".concat("stream/Stream");
        String concat9 = "java/util/".concat("Optional");
        uud uudVar = new uud(1);
        new qje(uudVar, "java/util/".concat("Iterator"), false, 12).J("forEachRemaining", null, new i1f(concat4, 0));
        new qje(uudVar, "java/lang/".concat("Iterable"), false, 12).J("spliterator", null, new pqk(7));
        qje qjeVar = new qje(uudVar, "java/util/".concat("Collection"), false, 12);
        qjeVar.J("removeIf", null, new i1f(concat2, 17));
        qjeVar.J("stream", null, new i1f(concat8, 26));
        qjeVar.J("parallelStream", null, new k1f(concat8, 1));
        qje qjeVar2 = new qje(uudVar, "java/util/".concat("List"), false, 12);
        qjeVar2.J("replaceAll", null, new k1f(concat7, 2));
        qjeVar2.J("addFirst", "2.1", new k1f(concat, 3));
        qjeVar2.J("addLast", "2.1", new k1f(concat, 4));
        qjeVar2.J("removeFirst", "2.1", new k1f(concat, 5));
        qjeVar2.J("removeLast", "2.1", new k1f(concat, 6));
        qje qjeVar3 = new qje(uudVar, "java/util/".concat("LinkedList"), false, 12);
        qjeVar3.J("addFirst", "2.1", new i1f(concat, 1));
        qjeVar3.J("addLast", "2.1", new i1f(concat, 2));
        qjeVar3.J("removeFirst", "2.1", new i1f(concat, 3));
        qjeVar3.J("removeLast", "2.1", new i1f(concat, 4));
        qje qjeVar4 = new qje(uudVar, "java/util/".concat("LinkedHashSet"), false, 12);
        qjeVar4.J("addFirst", "2.2", new i1f(concat, 5));
        qjeVar4.J("addLast", "2.2", new i1f(concat, 6));
        qjeVar4.J("removeFirst", "2.2", new i1f(concat, 7));
        qjeVar4.J("removeLast", "2.2", new i1f(concat, 8));
        qjeVar4.J("getFirst", "2.2", new i1f(concat, 9));
        qjeVar4.J("getLast", "2.2", new i1f(concat, 10));
        qje qjeVar5 = new qje(uudVar, "java/util/".concat("Map"), false, 12);
        qjeVar5.J("forEach", null, new i1f(concat6, 11));
        qjeVar5.J("putIfAbsent", null, new i1f(concat, 12));
        qjeVar5.J("replace", null, new i1f(concat, 13));
        qjeVar5.J("replace", null, new i1f(concat, 14));
        qjeVar5.J("replaceAll", null, new i1f(concat5, 15));
        qjeVar5.J("compute", null, new j1f(concat, concat5, 0));
        qjeVar5.J("computeIfAbsent", null, new j1f(concat, concat3, 1));
        qjeVar5.J("computeIfPresent", null, new j1f(concat, concat5, 2));
        qjeVar5.J("merge", null, new j1f(concat, concat5, 3));
        qje qjeVar6 = new qje(uudVar, "java/util/".concat("LinkedHashMap"), false, 12);
        qjeVar6.J("putFirst", "2.2", new i1f(concat, 16));
        qjeVar6.J("putLast", "2.2", new i1f(concat, 18));
        qje qjeVar7 = new qje(uudVar, concat9, false, 12);
        qjeVar7.J("empty", null, new i1f(concat9, 19));
        qjeVar7.J("of", null, new j1f(concat, concat9, 4));
        qjeVar7.J("ofNullable", null, new j1f(concat, concat9, 5));
        qjeVar7.J("get", null, new i1f(concat, 20));
        qjeVar7.J("ifPresent", null, new i1f(concat4, 21));
        new qje(uudVar, "java/lang/".concat("ref/Reference"), false, 12).J("get", null, new i1f(concat, 22));
        new qje(uudVar, concat2, false, 12).J("test", null, new i1f(concat, 23));
        new qje(uudVar, "java/util/function/".concat("BiPredicate"), false, 12).J("test", null, new i1f(concat, 24));
        new qje(uudVar, concat4, false, 12).J("accept", null, new i1f(concat, 25));
        new qje(uudVar, concat6, false, 12).J("accept", null, new i1f(concat, 27));
        new qje(uudVar, concat3, false, 12).J("apply", null, new i1f(concat, 28));
        new qje(uudVar, concat5, false, 12).J("apply", null, new i1f(concat, 29));
        new qje(uudVar, "java/util/function/".concat("Supplier"), false, 12).J("get", null, new k1f(concat, 0));
        d = uudVar.a;
    }
}
