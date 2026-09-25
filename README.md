
  <h1>🎮 Pixel Engine</h1>

  <p>
    <strong>A lightweight, cross-platform 2D game engine built in Java.</strong>
  </p>

  <!-- BADGES -->

  <p>
    <a href="#-features">Features</a> •
    <a href="#-architecture">Architecture</a> •
    <a href="#-getting-started">Getting Started</a> •
    <a href="#-quick-example">Code Example</a>
  </p>

</div>

<br />

<!-- DEMO / SCREENSHOT -->
<div align="center">
  

<img width="190" height="184" alt="Recording 2026-09-25 194238" src="https://github.com/user-attachments/assets/e50f5d4d-5d1f-4289-ad8b-339b72eb5512" />

</div>

---

## ⚡ Features

- 🎨 **Batch Renderer:** Optimized 2D quad and sprite rendering.
- ⚙️ **Entity Component System (ECS):** Flexible, cache-friendly entity management.
- 📐 **Collision System:** Rigid-body Collision.

---

## 🏗 Architecture Overview

```mermaid
graph TD
    A[Game Application] --> B["Graphics libraries (Graphics 2D and Jframe)"]
    B --> C["Game Loop (update(cd))"]
    C --> D[Component Object]
    
    D --> E[Character]
    D --> F[Terrain]
    D --> G[Sky]
    D --> H[Clouds]
    D --> I[Timer]
```


