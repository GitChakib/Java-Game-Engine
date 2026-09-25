

  <h1 align="center">🎮 Pixel Engine</h1>

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
  

<img width="792" height="234" alt="Recording 2026-09-25 200824" src="https://github.com/user-attachments/assets/ac4cb201-35f5-47d5-93dc-08c5d831c9be" />

</div>

---

## ⚡ Features

- 🎨 **Batch Renderer:** Optimized 2D quad and sprite rendering.
- ⚙️ **Entity Component System (ECS):** Flexible, cache-friendly entity management.
- 📐 **Collision System:** Rigid-body Collision.

---

<div align="center">
  

<img width="190" height="184" alt="Recording 2026-09-25 194238" src="https://github.com/user-attachments/assets/e50f5d4d-5d1f-4289-ad8b-339b72eb5512" />

</div>

## 🏗 Architecture Overview

```mermaid
graph TD
    A[Game Application] --> B["Graphics libraries (Graphics 2D and Jframe)"]
    A --> C["Game Loop (update(cd))"]
    
    B --> D[Component Object]
    C --> D
    
    D --> E[Character]
    D --> F[Terrain]
    D --> G[Sky]
    D --> H[Clouds]
    D --> I[Timer]
```

## 🛠 Tech Stack & Dependencies

- **Language:** JAVA 27
- **Libraries:** Swing and AWT (Should be built in JAVA)


---
### Prerequisites

- Ensure you have a JAVA 27 compatible IDE and JAVA 27, Also JDK HAS to be installed (if you want to add new things)

## 🚀 Getting Started

- Make sure you have the whole project downloaded or else some assets could be missing
- I didn't make an executable so it can only be ran through an IDE
- Can be easily tinkered with using the Component object, just create a new Object, extend it to Component and try it!



