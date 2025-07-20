import {createRoot} from 'react-dom/client';
import {createElement} from 'react';
import { resolveConfig } from 'vite';

const root=createRoot(document.getElementById('root')!);

const reactElement= createElement("h1", null , "hello this is test");

console.log(reactElement);

root.render( reactElement)
