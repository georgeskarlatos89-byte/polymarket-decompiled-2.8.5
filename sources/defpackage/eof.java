package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final class eof extends jg7 {
    public final /* synthetic */ int a;

    public /* synthetic */ eof(int i) {
        this.a = i;
    }

    @Override // defpackage.jg7
    public final void a(lcg lcgVar, Object obj) {
        switch (this.a) {
            case 0:
                lcgVar.getClass();
                ((hof) obj).getClass();
                lcgVar.l(1, r5.n);
                return;
            default:
                i0g i0gVar = (i0g) obj;
                lcgVar.getClass();
                i0gVar.getClass();
                lcgVar.H(1, i0gVar.a);
                return;
        }
    }

    @Override // defpackage.jg7
    public final String b() {
        switch (this.a) {
            case 0:
                return "DELETE FROM `stream_chat_reaction` WHERE `id` = ?";
            default:
                return "DELETE FROM `stream_chat_reply_message` WHERE `id` = ?";
        }
    }
}
