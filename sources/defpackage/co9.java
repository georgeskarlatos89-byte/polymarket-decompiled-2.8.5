package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public interface co9 extends yof {
    public static final ow0 o0;
    public static final ow0 p0;
    public static final ow0 q0;

    static {
        Class cls = Integer.TYPE;
        o0 = new ow0("camerax.core.imageInput.inputFormat", cls, null);
        p0 = new ow0("camerax.core.imageInput.secondaryInputFormat", cls, null);
        q0 = new ow0("camerax.core.imageInput.inputDynamicRange", c57.class, null);
    }

    default int getInputFormat() {
        return ((Integer) h(o0)).intValue();
    }
}
