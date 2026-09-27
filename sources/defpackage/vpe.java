package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class vpe {
    public final upe a;

    public vpe(upe upeVar) {
        this.a = upeVar;
    }

    public final void a() {
        try {
            ((vpe) Class.forName("androidx.media3.effect.PreviewingSingleInputVideoGraph$Factory").getConstructor(upe.class).newInstance(this.a)).a();
        } catch (Exception e) {
            if (e instanceof i8k) {
                int i = i8k.a;
                throw ((i8k) e);
            }
            throw new Exception(e);
        }
    }
}
