package Bai21.MemoryPool;

public class BulletPool extends MemoryPool<Bullet>{

    @Override
    protected Bullet allocate() {
        return new Bullet();
    }
}
