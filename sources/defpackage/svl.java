package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public abstract class svl {
    public static final aga a = new aga("STRIKETHROUGH");
    public static final aga b = new aga("TABLE");
    public static final aga c = new aga("HEADER");
    public static final aga d = new aga("ROW");
    public static final aga e = new aga("INLINE_MATH");
    public static final aga f = new aga("BLOCK_MATH");
    public static eq9 g;

    public static final boolean a(dck dckVar, dck dckVar2, pnb pnbVar) {
        dckVar.getClass();
        pnbVar.getClass();
        if (dckVar2 == null) {
            return true;
        }
        if ((dckVar2 instanceof bck) && (dckVar instanceof ack)) {
            return true;
        }
        if ((dckVar instanceof bck) && (dckVar2 instanceof ack)) {
            return false;
        }
        if (dckVar.c != dckVar2.c || dckVar.d != dckVar2.d || dckVar2.a(pnbVar) > dckVar.a(pnbVar)) {
            return true;
        }
        return false;
    }
}
