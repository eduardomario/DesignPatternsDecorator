# Decorator

El patron de diseño del decorator busca adjuntar responsabilidades adicionales a un objeto sin afectar a este mismo.

La forma en que funciona es que envuelve la funcionalidad principal o basica del componente, y, apartir de esto, crea nuevas funcionalidades apartir de las ya establecidas sin modificar las ya existentes.

## Diagrama

![Diagrama](https://refactoring.guru/images/patterns/diagrams/decorator/structure.png)

### Component

Es la base de los componentes concretos, de donde se derivan sus funciones principales

### ConcreteComponent

Son los objetos que ejecutaran las funcines base

### BaseDecorator

Es donde se determinaran las funciones adicinales que se desean agregar
Obtenes las funciones base de los ConcreteComponents atravez del Component

### ConcreteDecorator

Son los objetos que ejecutaran las funcines adicionales

Link: [DesignPatternDecorator](https://refactoring.guru/design-patterns/decorator).